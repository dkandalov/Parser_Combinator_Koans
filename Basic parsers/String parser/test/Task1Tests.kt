import org.junit.Test

class Task1Tests {
    private val fooParser: Parser<String> = string("foo")
    private val barParser: Parser<String> = string("bar")

    @Test fun `1 - no match`() {
        fooParser.parse(Input("")) shouldEqual null
        fooParser.parse(Input("---")) shouldEqual null
        fooParser.parse(Input("f--")) shouldEqual null
        fooParser.parse(Input("fo-")) shouldEqual null
        fooParser.parse(Input("foo", offset = 1)) shouldEqual null
        fooParser.parse(Input("-foo")) shouldEqual null

        fooParser.parse(Input("bar")) shouldEqual null
        barParser.parse(Input("foo")) shouldEqual null
    }

    @Test fun `2 - full match`() {
        fooParser.parse(Input("foo")) shouldEqual Output(
            payload = "foo",
            nextInput = Input("foo").consumed()
        )
        barParser.parse(Input("bar")) shouldEqual Output(
            payload = "bar",
            nextInput = Input("bar").consumed()
        )
    }

    @Test fun `3 - prefix match`() {
        fooParser.parse(Input("foo--")) shouldEqual Output(
            payload = "foo",
            nextInput = Input("foo--", offset = 3)
        )
    }

    @Test fun `4 - postfix match`() {
        fooParser.parse(Input("--foo", offset = 2)) shouldEqual Output(
            payload = "foo",
            nextInput = Input("--foo", offset = 5)
        )
    }
}
