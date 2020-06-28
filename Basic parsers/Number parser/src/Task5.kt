
fun number(): Parser<String> =
    repeat(oneOf((0..9).map { string(it.toString()) }))
        .map { it.joinToString("") }

fun <T, R> Parser<T>.map(transform: (T) -> R): Parser<R> = object : Parser<R> {
    override fun parse(input: Input): Output<R>? {
        val parser = this@map
        val output = parser.parse(input) ?: return null
        return Output(transform(output.payload), output.nextInput)
    }
}
