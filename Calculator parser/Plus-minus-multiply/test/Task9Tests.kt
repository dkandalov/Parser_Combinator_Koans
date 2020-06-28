import org.junit.Test

class Task9Tests {
    @Test fun `1 - add and subtract`() {
        CalculatorGrammar.parse("1 - 2 + 3 - 4")?.payload
            .toStringExpression() shouldEqual "(((1 - 2) + 3) - 4)"
    }

    @Test fun `2 - multiply three numbers`() {
        CalculatorGrammar.parse("2 * 3 * 4")?.payload
            .toStringExpression() shouldEqual "((2 * 3) * 4)"
    }

    @Test fun `3 - add and multiply`() {
        CalculatorGrammar.parse("1 * 2 + 3")?.payload
            .toStringExpression() shouldEqual "((1 * 2) + 3)"

        CalculatorGrammar.parse("1 + 2 * 3")?.payload
            .toStringExpression() shouldEqual "(1 + (2 * 3))"

        CalculatorGrammar.parse("1 + 2 * 3 * 4 - 5 - 6")?.payload
            .toStringExpression() shouldEqual "(((1 + ((2 * 3) * 4)) - 5) - 6)"
    }
}
