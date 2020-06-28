object CalculatorGrammar {
    private val number = number().map { IntLiteral(it.toInt()) }

    private val plusOrMinus =
        inOrder(
            ref { expression1 },
            repeat(inOrder(
                oneOf(string(" + "), string(" - ")),
                ref { expression1 }
            ))
        ).map { (first, rest) ->
            rest.fold(first) { left, (op, right) ->
                when (op) {
                    " - " -> Minus(left, right)
                    " + " -> Plus(left, right)
                    else -> error("")
                }
            }
        }

    private val multiply =
        inOrder(
            number,
            repeat(inOrder(string(" * "), number))
        ).map { (first, rest) ->
            rest.fold(first as Expression) { left, (_, right) ->
                Multiply(left, right)
            }
        }

    private val expression1 = oneOf(multiply, number)
    private val expression: Parser<Expression> = oneOf(plusOrMinus, multiply, number)

    fun parse(s: String) = expression.parse(Input(s))
}
