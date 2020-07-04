
fun number(): Parser<String> = TODO()

fun <T, R> Parser<T>.map(transform: (T) -> R): Parser<R> = object : Parser<R> {
    override fun parse(input: Input): Output<R>? {
        val parser = this@map // parser on which `.map()` is defined as an extension function
        TODO()
    }
}
