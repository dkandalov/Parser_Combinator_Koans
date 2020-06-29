
object PlusGrammar {
    private val number = number().map { IntLiteral(it.toInt()) }

    private val plus = inOrder(number, string(" + "), ref { expression })
        .map { (left, _, right) -> Plus(left, right) }

    private val expression: Parser<ASTNode> = oneOf(plus, number)

    fun parse(s: String) = expression.parse(Input(s))
}

fun <T> ref(f: () -> Parser<T>): Parser<T> = object : Parser<T> {
    override fun parse(input: Input) = f().parse(input)
}
