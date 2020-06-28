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
            ref { term },
            repeat(inOrder(string(" * "), ref { term }))
        ).map { (first, rest) ->
            rest.fold(first) { left, (_, right) -> Multiply(left, right) }
        }

    private val parens =
        inOrder(string("("), ref { expression }, string(")"))
            .map { (_, it, _) -> it }

    private val term = oneOf(parens, number)
    private val expression1 = oneOf(multiply, term)
    private val expression: Parser<Expression> = oneOf(plusOrMinus, multiply, term)

    fun parse(s: String) = expression.parse(Input(s))
}