
object MinusGrammar {
    private val number = number().map { IntLiteral(it.toInt()) }

    private val minus = inOrder(number, onceOrMore(inOrder(string(" - "), number)))
        .map { (first, rest) ->
            rest.fold(first as ASTNode) { left, (_, right) -> Minus(left, right) }
        }

    private val expression: Parser<ASTNode> = oneOf(minus, number)

    fun parse(s: String) = expression.parse(Input(s))
}
