
object PlusGrammar {

    private val expression: Parser<ASTNode> = TODO()

    fun parse(s: String) = expression.parse(Input(s))
}

fun <T> ref(f: () -> Parser<T>): Parser<T> = object : Parser<T> {
    override fun parse(input: Input) = f().parse(input)
}
