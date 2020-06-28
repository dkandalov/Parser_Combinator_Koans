
fun string(s: String): Parser<String> = object : Parser<String> {
    override fun parse(input: Input) =
        if (!input.unprocessed.startsWith(s)) null
        else Output(s, input.copy(offset = input.offset + s.length))
}
