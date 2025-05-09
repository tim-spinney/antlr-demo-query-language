import QueriesParser.LogicalExpressionContext
import QueriesParser.NumericExpressionContext

class InstructionGeneratingTreeListener : QueriesBaseListener() {
    private val _instructions = mutableListOf<Instruction>()
    private val _labelIndices = mutableListOf<Int>()

    val instructions get() = _instructions.toList()
    /** Each element's index is the id of a particular label (think of these as auto-incrementing).
        Each element's value is the index of the instruction that immediately follows the label.
     */
    val labels get() = _labelIndices.toList()

    private val shortCircuitJumps = mutableListOf<ShortCircuitJumps>()

    private fun reserveLabel(): Int {
        _labelIndices.add(-1)
        return _labelIndices.size - 1
    }

    private fun placeLabel(): Int {
        _labelIndices.add(_instructions.size)
        return _labelIndices.size - 1
    }

    private fun placeReservedLabel(labelNumber: Int) {
        _labelIndices[labelNumber] = _instructions.size
    }

    override fun enterQuery(ctx: QueriesParser.QueryContext) {
        placeLabel()
    }

    override fun exitQuery(ctx: QueriesParser.QueryContext) {
        _instructions += Instruction(Operation.RET)
    }

    override fun enterLogicalExpression(ctx: LogicalExpressionContext) {
        when(ctx.op.type) {
            QueriesParser.And, QueriesParser.Or -> {
                val isPositive = ctx.op.type == QueriesParser.Or
                if(shortCircuitJumps.isEmpty()) {
                    shortCircuitJumps += ShortCircuitJumps(
                        reserveLabel(),
                        reserveLabel(),
                        isPositive
                    )
                } else {
                    val fallThroughParentToo = shortCircuitJumps.last().isPositive == isPositive
                    if(fallThroughParentToo) { // then our fallthrough destination is our parent's and our continuation should continue into our parent's RHS
                        shortCircuitJumps += ShortCircuitJumps(
                            shortCircuitJumps.last().fallthroughDestination,
                            reserveLabel(),
                            isPositive
                        )
                    } else { // our fallthrough continues to the parent's RHS and our continuation falls through our parent
                        shortCircuitJumps += ShortCircuitJumps(

                            reserveLabel(),
                            shortCircuitJumps.last().fallthroughDestination,
                            isPositive
                        )
                    }
                }

            }
        }
    }

    override fun exitLogicalExpression(ctx: LogicalExpressionContext) {
        when(ctx.op.type) {
            QueriesParser.And, QueriesParser.Or -> {
                val endingShortCircuit = shortCircuitJumps.removeLast()
                if(shortCircuitJumps.isEmpty()) {
                    _instructions += LiteralInstruction(Operation.PUSH, !endingShortCircuit.isPositive)
                    _instructions += JumpInstruction(Operation.JUMP, endingShortCircuit.exitDestination)
                    placeReservedLabel(endingShortCircuit.fallthroughDestination)
                    _instructions += LiteralInstruction(Operation.PUSH, endingShortCircuit.isPositive)
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
                    _instructions += JumpInstruction(
                        Operation.JUMP,
                        continuationDestination
                    )
                    placeReservedLabel(endingShortCircuit.fallthroughDestination)
                    // now we handle what happens if we short-circuited
                    if(endingShortCircuit.isPositive == fallThroughParentOnTrue) { // if conditions match, short-circuit the parent too
                        shortCircuitJumps.last().fallthroughDestination
                    } // otherwise just keep going
                }
                placeReservedLabel(endingShortCircuit.exitDestination)
            }
            QueriesParser.Not -> {
                _instructions += Instruction(Operation.NOT)
            }
            QueriesParser.Comparator -> {
                _instructions += handleNumericComparison(ctx)
                val op = if(shortCircuitJumps.last().isPositive) Operation.JUMP_IF_TRUE else Operation.JUMP_IF_FALSE
                _instructions += JumpInstruction(op, shortCircuitJumps.last().fallthroughDestination)
            }
            else -> throw IllegalArgumentException("Unexpected operator: ${ctx.op.text}")
        }
    }

    private fun handleNumericComparison(ctx: LogicalExpressionContext) = when(ctx.Comparator().text) {
        "<" -> Instruction(Operation.LT)
        "<=" -> Instruction(Operation.LTE)
        ">" -> Instruction(Operation.GT)
        ">=" -> Instruction(Operation.GTE)
        "==" -> Instruction(Operation.EQ)
        "<>" -> Instruction(Operation.NE)
        else -> throw IllegalArgumentException("Unexpected comparator: ${ctx.Comparator().text}")
    }

    override fun exitNumericExpression(ctx: NumericExpressionContext) {
        if(ctx.Identifier() != null) {
            _instructions += MemoryAccessInstruction(Operation.LOAD, ctx.Identifier().text)
        } else if(ctx.IntLiteral() != null) {
            _instructions += LiteralInstruction(Operation.PUSH, ctx.IntLiteral().text.toInt())
        } else if(ctx.op != null) {
            _instructions += when (ctx.op.type) {
                QueriesParser.Mult -> Instruction(Operation.MUL)
                QueriesParser.Div -> Instruction(Operation.DIV)
                QueriesParser.Add -> Instruction(Operation.ADD)
                QueriesParser.Sub -> Instruction(Operation.SUB)
                QueriesParser.Mod -> Instruction(Operation.MOD)
                else -> throw IllegalArgumentException("Unexpected operator: ${ctx.op.text}")
            }
        } else {
            throw IllegalArgumentException("Unexpected expression: $ctx")
        }
    }
}