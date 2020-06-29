
fun string(value: String): Parser<String> = object : Parser<String> {
    override fun parse(input: Input) =
        if (!input.unprocessed.startsWith(value)) null
        else Output(value, input.copy(offset = input.offset + value.length))
}
