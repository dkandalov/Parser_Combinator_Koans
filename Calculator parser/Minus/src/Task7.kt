
object MinusGrammar {
    private val number = number().map { IntLiteral(it.toInt()) }

    private val minus = inOrder(number, repeat(inOrder(string(" - "), number)))
        .map { (first, rest) ->
            rest.fold(first as Expression) { left, (_, right) -> Minus(left, right) }
        }

    private val expression: Parser<Expression> = oneOf(minus, number)

    fun parse(s: String) = expression.parse(Input(s))
}
