fun <T> oneOrMore(parser: Parser<T>): Parser<List<T>> = object : Parser<List<T>> {
    override fun parse(input: Input): Output<List<T>>? {
        TODO()
    }
}