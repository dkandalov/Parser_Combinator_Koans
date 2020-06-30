fun <T> oneOf(vararg parsers: Parser<T>): Parser<T> = object : Parser<T> {
    override fun parse(input: Input): Output<T>? {
        TODO()
    }
}

fun <T> oneOf(parsers: List<Parser<T>>): Parser<T> = oneOf(*parsers.toTypedArray())
