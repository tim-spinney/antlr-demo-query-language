import QueriesParser.*
import java.lang.classfile.CodeBuilder
import java.lang.classfile.Label
import java.lang.constant.ClassDesc
import java.lang.constant.ConstantDescs
import java.lang.constant.MethodTypeDesc

class JVMBytecodeGeneratingTreeListener(private val codeBuilder: CodeBuilder, private val dataType: Type) : QueriesBaseListener() {
    private var _startLoopLabel: Label? = null
    private var _endLoopLabel: Label? = null

    private class ConditionLabels(val exitDestination: Label, val fallthroughDestination: Label, val isPositive: Boolean)
    private val shortCircuitJumps = mutableListOf<ConditionLabels>()

    override fun enterQuery(ctx: QueryContext) {
        // int length = data.length
        codeBuilder
            .aload(1)
            .arraylength()
            .istore(2)

        // ArrayList<T> matches = new ArrayList<T>()
        codeBuilder
            .new_(ClassDesc.of("java.util", "ArrayList"))
            .dup()
            .invokespecial(ClassDesc.of("java.util", "ArrayList"), "<init>", MethodTypeDesc.of(ConstantDescs.CD_Void))
            .astore(3)

        // int index = 0
        codeBuilder
            .iconst_0()
            .istore(4)

        _startLoopLabel = codeBuilder.newBoundLabel()
        _endLoopLabel = codeBuilder.newLabel()

        // index < length
        codeBuilder
            .iload(4)
            .iload(2)
            .if_icmpge(_endLoopLabel)


        // it = data[index]
        codeBuilder
            .aload(1)
            .iload(4)
            .aaload()
            .astore(5)
    }

    override fun exitQuery(ctx: QueryContext) {
        // stack currently has boolean on it representing result of WHERE clause
        val noMatchLabel = codeBuilder.newLabel()
        // skip next instructions if result was false/0
        codeBuilder.ifeq(noMatchLabel)

        // matches.add(result)
        codeBuilder
            .aload(3)
            .aload(5)
            .invokevirtual(ClassDesc.of("java.util", "ArrayList"), "add", MethodTypeDesc.of(ConstantDescs.CD_Boolean, ConstantDescs.CD_Object))
            .pop()

        // matches[index] = null
        codeBuilder
            .labelBinding(noMatchLabel)

        // index++
        codeBuilder.iinc(4, 1)

        // }
        codeBuilder.goto_(_startLoopLabel)
        codeBuilder.labelBinding(_endLoopLabel)

        // return matches
        codeBuilder
            .aload(3)
            .invokevirtual(ClassDesc.of("java.util", "ArrayList"), "toArray", MethodTypeDesc.of(ConstantDescs.CD_Object.arrayType()))
            .areturn()
    }

    override fun enterLogicalExpression(ctx: LogicalExpressionContext) {
        when(ctx.op.type) {
            And, Or -> {
                val isPositive = ctx.op.type == Or
                if(shortCircuitJumps.isEmpty()) {
                    shortCircuitJumps += ConditionLabels(
                        codeBuilder.newLabel(),
                        codeBuilder.newLabel(),
                        isPositive
                    )
                } else {
                    val fallThroughParentToo = shortCircuitJumps.last().isPositive == isPositive
                    if(fallThroughParentToo) { // then our fallthrough destination is our parent's and our continuation should continue into our parent's RHS
                        shortCircuitJumps += ConditionLabels(
                            shortCircuitJumps.last().fallthroughDestination,
                            codeBuilder.newLabel(),
                            isPositive
                        )
                    } else { // our fallthrough continues to the parent's RHS and our continuation falls through our parent
                        shortCircuitJumps += ConditionLabels(

                            codeBuilder.newLabel(),
                            shortCircuitJumps.last().fallthroughDestination,
                            isPositive
                        )
                    }
                }

            }
        }
    }

    private fun handleExitingTopLevelLogicalBinaryExpression(endingConditional: ConditionLabels) {
        // we didn't stop early, so if stopping early was for a positive outcome then place negative here for the continuation
        if(endingConditional.isPositive) {
            codeBuilder.iconst_0()
        } else {
            codeBuilder.iconst_1()
        }
        // then leapfrog the code for stopping early
        codeBuilder.goto_(endingConditional.exitDestination)
        // place the target for stopping early
        codeBuilder.labelBinding(endingConditional.fallthroughDestination)
        if(endingConditional.isPositive) {
            codeBuilder.iconst_1()
        } else {
            codeBuilder.iconst_0()
        }
    }

    override fun exitLogicalExpression(ctx: LogicalExpressionContext) {
        when(ctx.op.type) {
            And, Or -> {
                val endingShortCircuit = shortCircuitJumps.removeLast()
                if(shortCircuitJumps.isEmpty()) {
                   handleExitingTopLevelLogicalBinaryExpression(endingShortCircuit)
                } else { // there's a parent expression and we need to act as its LHS
                    // first, we place the instruction that says what to do if we just kept going rather than jumping
                    // if the expression we're completing jumps on true and we got here by not jumping, then it must have evaluated to false
                    // conversely, jumping on false means we got here because it evaluated to true
                    val continuingResultedInTrue = !endingShortCircuit.isPositive
                    // now check if our parent short-circuits on true or false
                    val fallThroughParentOnTrue = shortCircuitJumps.last().isPositive
                    val continuationDestination = if(continuingResultedInTrue == fallThroughParentOnTrue) { // and jump to its fallthrough if we meet the condition
                        shortCircuitJumps.last().fallthroughDestination
                    } else { // we didn't meet fallthrough criteria and need to continue to the RHS
                        endingShortCircuit.exitDestination
                    }
                    codeBuilder.goto_(continuationDestination)
                    codeBuilder.labelBinding(endingShortCircuit.fallthroughDestination)
                    // now we handle what happens if we short-circuited
                    if(endingShortCircuit.isPositive == fallThroughParentOnTrue) { // if conditions match, short-circuit the parent too
                       codeBuilder.goto_(shortCircuitJumps.last().fallthroughDestination)
                    } // otherwise just keep going
                }
                codeBuilder.labelBinding(endingShortCircuit.exitDestination)
            }
            Not -> {
                // This is how javac handles negation. Could we do it more efficiently with xor?
                val becomeFalseLabel = codeBuilder.newLabel()
                val becomeTrueLabel = codeBuilder.newLabel()
                codeBuilder.ifne(becomeFalseLabel) // if not 0, currently truthy, should become false
                codeBuilder.iconst_1()
                codeBuilder.goto_(becomeTrueLabel)
                codeBuilder.labelBinding(becomeFalseLabel)
                codeBuilder.iconst_0()
                codeBuilder.labelBinding(becomeTrueLabel)
            }
            Comparator -> {
                var comparison = handleNumericComparison(ctx)
                if(shortCircuitJumps.isEmpty()) {
                    val trueLabel = codeBuilder.newLabel()
                    comparison.addInstruction(codeBuilder, trueLabel)
                    codeBuilder.iconst_0()
                    val exitLabel = codeBuilder.newLabel()
                    codeBuilder.goto_(exitLabel)
                    codeBuilder.labelBinding(trueLabel)
                    codeBuilder.iconst_1()
                    codeBuilder.labelBinding(exitLabel)
                } else {
                    if (!shortCircuitJumps.last().isPositive) {
                        comparison = comparison.negate()
                    }
                    comparison.addInstruction(codeBuilder, shortCircuitJumps.last().fallthroughDestination)
                }
            }
            else -> throw IllegalArgumentException("Unexpected operator: ${ctx.op.text}")
        }
    }

    private fun handleNumericComparison(ctx: LogicalExpressionContext) = when(ctx.Comparator().text) {
        "<" -> ComparisonOperation.LT
        "<=" -> ComparisonOperation.LTE
        ">" -> ComparisonOperation.GT
        ">=" -> ComparisonOperation.GTE
        "==" -> ComparisonOperation.EQ
        "<>" -> ComparisonOperation.NE
        else -> throw IllegalArgumentException("Unexpected comparator: ${ctx.Comparator().text}")
    }

    enum class ComparisonOperation() {
        LT, LTE, GT, GTE, EQ, NE
        ;
        fun negate() = when(this) {
            LT -> GTE
            LTE -> GT
            GT -> LTE
            GTE -> LT
            EQ -> NE
            NE -> EQ
        }
        fun addInstruction(codeBuilder: CodeBuilder, label: Label) = when(this) {
            LT -> codeBuilder.if_icmplt(label)
            LTE -> codeBuilder.if_icmple(label)
            GT -> codeBuilder.if_icmpgt(label)
            GTE -> codeBuilder.if_icmpge(label)
            EQ -> codeBuilder.if_icmpeq(label)
            NE -> codeBuilder.if_icmpne(label)
        }
    }

    override fun exitNumericExpression(ctx: NumericExpressionContext) {
        if(ctx.variableAccess()?.VarName() != null) {
            /* Note: This assumes that the only named variable in this scope is "it", the current data item.
               We'll need a local mapping of variable name to memory index for query-local variables
               and either member variables or a param representing context for surrounding-scope variables.
             */
            when(dataType) {
                is IntType -> codeBuilder.iload(5)
                is UserDefinedType -> codeBuilder.aload(5)
                else -> throw IllegalArgumentException("Unexpected data type: $dataType")
            }
            codeBuilder.aload(5)
            var variableAccess = ctx.variableAccess().variableAccess()
            var currentType = dataType
            var currentJavaType = ClassDesc.of(currentType.name)
            while(variableAccess != null) {
                val fieldName = variableAccess.VarName().text
                val fieldType = (currentType as UserDefinedType).fields[fieldName]?.type ?: throw IllegalArgumentException("Field $fieldName not defined on $currentType")
                val fieldJavaType = when(fieldType) {
                    is IntType -> ConstantDescs.CD_int
                    is UserDefinedType -> ClassDesc.of(fieldType.name)
                    else -> throw IllegalArgumentException("Unexpected field type: $fieldType")
                }
                codeBuilder.getfield(currentJavaType, variableAccess.VarName().text, fieldJavaType)
                variableAccess = variableAccess.variableAccess()
                currentType = fieldType
                currentJavaType = fieldJavaType
            }
        } else if(ctx.IntLiteral() != null) {
            codeBuilder.ldc(codeBuilder.constantPool().intEntry(ctx.IntLiteral().text.toInt()))
        } else if(ctx.op != null) {
            when (ctx.op.type) {
                Mult -> codeBuilder.imul()
                Div -> codeBuilder.idiv()
                Add -> codeBuilder.iadd()
                Sub -> codeBuilder.isub()
                Mod -> codeBuilder.irem()
                else -> throw IllegalArgumentException("Unexpected operator: ${ctx.op.text}")
            }
        } else {
            throw IllegalArgumentException("Unexpected expression: $ctx")
        }
    }
}