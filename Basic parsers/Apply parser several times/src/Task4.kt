
fun <T> onceOrMore(parser: Parser<T>): Parser<List<T>> = object : Parser<List<T>> {
    override fun parse(input: Input): Output<List<T>>? {
        var result = Output(emptyList<T>(), input)
        var output = parser.parse(result.nextInput)
        while (output != null) {
            result = Output(result.payload + output.payload, output.nextInput)
            output = parser.parse(output.nextInput)
        }
        return if (result.payload.isEmpty()) null else result
    }
}
