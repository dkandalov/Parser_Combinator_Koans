import org.junit.Test

class Task6Tests {
    @Test fun `1 - parse number`() {
        PlusGrammar.parse("123")?.payload shouldEqual IntLiteral(123)
    }

    @Test fun `2 - add two numbers`() {
        PlusGrammar.parse("1 + 2")?.payload shouldEqual Plus(IntLiteral(1), IntLiteral(2))
        PlusGrammar.parse("12 + 34")?.payload shouldEqual Plus(IntLiteral(12), IntLiteral(34))
    }

    @Test fun `3 - add three numbers (right associative)`() {
        PlusGrammar.parse("1 + 2 + 3")?.payload.let {
            it shouldEqual Plus(
                IntLiteral(1),
                Plus(IntLiteral(2), IntLiteral(3))
            )
            it.toStringExpression() shouldEqual "(1 + (2 + 3))"
        }
    }
}
