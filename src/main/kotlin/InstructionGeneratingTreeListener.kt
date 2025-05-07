import QueriesParser.LogicalExpressionContext

class InstructionGeneratingTreeListener : QueriesBaseListener() {
    private val _instructions = mutableListOf<Instruction>()

    val instructions get() = _instructions.toList()

    override fun exitLogicalExpression(ctx: QueriesParser.LogicalExpressionContext) {
        _instructions += when(ctx.op.type) {
            QueriesParser.And -> Instruction(Operation.AND)
            QueriesParser.Or -> Instruction(Operation.OR)
            QueriesParser.Not -> Instruction(Operation.NOT)
            QueriesParser.Comparator -> handleNumericComparison(ctx)
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