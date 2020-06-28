fun <T> oneOf(vararg parsers: Parser<T>): Parser<T> = object : Parser<T> {
    override fun parse(input: Input): Output<T>? {
        parsers.forEach {
            val output = it.parse(input)
            if (output != null) return output
        }
        return null
    }
}

fun <T> oneOf(parsers: List<Parser<T>>): Parser<T> = oneOf(*parsers.toTypedArray())
