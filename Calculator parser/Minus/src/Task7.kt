
object MinusGrammar {

    private val expression: Parser<ASTNode> = TODO()

    fun parse(s: String) = expression.parse(Input(s))
}
