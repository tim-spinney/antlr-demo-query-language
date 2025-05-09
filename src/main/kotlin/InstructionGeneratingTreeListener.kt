import QueriesParser.LogicalExpressionContext

class InstructionGeneratingTreeListener : QueriesBaseListener() {
    private val _instructions = mutableListOf<Instruction>()
    private val _labelIndices = mutableListOf<Int>()

    val instructions get() = _instructions.toList()
    val labels get() = _labelIndices.toList()

    private var fallthroughDestination: Int = -1
    private var exitDestination: Int = -1

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
            QueriesParser.And -> {
                fallthroughDestination = reserveLabel()
                exitDestination = reserveLabel()
            }
            QueriesParser.Or -> {
                fallthroughDestination = reserveLabel()
                exitDestination = reserveLabel()
            }
        }
    }

    override fun exitLogicalExpression(ctx: QueriesParser.LogicalExpressionContext) {
        when(ctx.op.type) {
            QueriesParser.And -> {
                _instructions += LiteralInstruction(Operation.PUSH, true)
                _instructions += JumpInstruction(Operation.JUMP, exitDestination)
                placeReservedLabel(fallthroughDestination)
                _instructions += LiteralInstruction(Operation.PUSH, false)
                placeReservedLabel(exitDestination)
            }
            QueriesParser.Or -> {
                _instructions += LiteralInstruction(Operation.PUSH, false)
                _instructions += JumpInstruction(Operation.JUMP, exitDestination)
                placeReservedLabel(fallthroughDestination)
                _instructions += LiteralInstruction(Operation.PUSH, true)
                placeReservedLabel(exitDestination)
            }
            QueriesParser.Not -> {
                _instructions += Instruction(Operation.NOT)
            }
            QueriesParser.Comparator -> {
                _instructions += handleNumericComparison(ctx)
                // TODO: JUMP_IF_TRUE for OR, FALSE is for AND only
                _instructions += JumpInstruction(Operation.JUMP_IF_FALSE, fallthroughDestination)
            }
            else -> throw IllegalArgumentException("Unexpected operator: ${ctx.op.text}")
        }
    }

    private fun handleNumericComparison(ctx: LogicalExpressionContext) = when(ctx.Comparator().text) {
        "<" -> Instruction(Operation.LT)
        "<=" -> Instruction(Operation.LTE)
        ">" -> Instruction(Operation.GT)
        ">=" -> Instruction(Operation.GTE)
        "=" -> Instruction(Operation.EQ)
        "<>" -> Instruction(Operation.NE)
        else -> throw IllegalArgumentException("Unexpected comparator: ${ctx.Comparator().text}")
    }

    override fun exitNumericExpression(ctx: QueriesParser.NumericExpressionContext) {
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