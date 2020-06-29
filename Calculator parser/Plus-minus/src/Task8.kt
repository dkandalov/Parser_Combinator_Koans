object CalculatorGrammar {
    private val number = number().map { IntLiteral(it.toInt()) }

    private val plusOrMinus = inOrder(
        number,
        onceOrMore(inOrder(
            oneOf(string(" + "), string(" - ")),
            number
        ))
    ).map { (first, rest) ->
        rest.fold(first as ASTNode) { left, (op, right) ->
            when (op) {
                " - " -> Minus(left, right)
                " + " -> Plus(left, right)
                else -> error("")
            }
        }
    }

    private val expression: Parser<ASTNode> = oneOf(plusOrMinus, number)

    fun parse(s: String) = expression.parse(Input(s))
}
