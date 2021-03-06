import org.junit.Test

class Task3Tests {
    private val parser: Parser<String> =
        oneOf(string("foo"), string("bar"), string("buz"))

    @Test fun `1 - no match`() {
        parser.parse(Input("---")) shouldEqual null
    }

    @Test fun `2 - full match first parser`() {
        val input = Input("foo")
        parser.parse(input) shouldEqual Output(
            payload = "foo",
            nextInput = input.consumed()
        )
    }

    @Test fun `3 - full match second parser`() {
        val input = Input("bar")
        parser.parse(input) shouldEqual Output(
            payload = "bar",
            nextInput = input.consumed()
        )
    }

    @Test fun `4 - full match third parser`() {
        val input = Input("buz")
        parser.parse(input) shouldEqual Output(
            payload = "buz",
            nextInput = input.consumed()
        )
    }
}
