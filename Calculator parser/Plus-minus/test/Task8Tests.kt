import org.junit.Test

class Task8Tests {
    @Test fun `1 - subtract two numbers`() {
        CalculatorGrammar.parse("1 - 2")?.payload shouldEqual Minus(IntLiteral(1), IntLiteral(2))
        CalculatorGrammar.parse("2 - 1")?.payload shouldEqual Minus(IntLiteral(2), IntLiteral(1))
    }

    @Test fun `2 - add two numbers`() {
        CalculatorGrammar.parse("1 + 2")?.payload shouldEqual Plus(IntLiteral(1), IntLiteral(2))
        CalculatorGrammar.parse("12 + 34")?.payload shouldEqual Plus(IntLiteral(12), IntLiteral(34))
    }

    @Test fun `3 - subtract three numbers (left associative)`() {
        CalculatorGrammar.parse("1 - 2 - 3")?.payload
            .toStringExpression() shouldEqual "((1 - 2) - 3)"
    }

    @Test fun `4 - add three numbers (left associative)`() {
        CalculatorGrammar.parse("1 + 2 + 3")?.payload
            .toStringExpression() shouldEqual "((1 + 2) + 3)"
    }

    @Test fun `5 - add and subtract`() {
        CalculatorGrammar.parse("1 - 2 + 3 - 4")?.payload
            .toStringExpression() shouldEqual "(((1 - 2) + 3) - 4)"
    }
}
