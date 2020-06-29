import org.junit.Test

class Task4Tests {
    private val parser = onceOrMore(string("foo"))

    @Test fun `1 - no match`() {
        parser.parse(Input("")) shouldEqual null
        parser.parse(Input("---")) shouldEqual null
        parser.parse(Input("f--")) shouldEqual null
        parser.parse(Input("fo-")) shouldEqual null
    }

    @Test fun `2 - match once`() {
        val input = Input("foo")
        parser.parse(input) shouldEqual Output(
            payload = listOf("foo"),
            nextInput = input.consumed()
        )
    }

    @Test fun `3 - match twice`() {
        val input = Input("foofoo")
        parser.parse(input) shouldEqual Output(
            payload = listOf("foo", "foo"),
            nextInput = input.consumed()
        )
    }

    @Test fun `4 - match five times`() {
        val input = Input("foofoofoofoofoo")
        parser.parse(input) shouldEqual Output(
            payload = listOf("foo", "foo", "foo", "foo", "foo"),
            nextInput = input.consumed()
        )
    }
}
