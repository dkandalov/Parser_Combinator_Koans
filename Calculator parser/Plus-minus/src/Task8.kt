object CalculatorGrammar {
    private val number = number().map { IntLiteral(it.toInt()) }

    private val plusOrMinus = inOrder(
        number,
        repeat(inOrder(
            oneOf(string(" + "), string(" - ")),
            number
        ))
    ).map { (first, rest) ->
        rest.fold(first as Expression) { left, (op, right) ->
            when (op) {
                " - " -> Minus(left, right)
                " + " -> Plus(left, right)
                else -> error("")
            }
        }
    }

    private val expression: Parser<Expression> = oneOf(plusOrMinus, number)

    fun parse(s: String) = expression.parse(Input(s))
}
