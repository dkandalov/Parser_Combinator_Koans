
interface Parser<out T> {
    /**
     * @return [Output] if the parser was able to consume part of the [input] or `null` otherwise
     */
    fun parse(input: Input): Output<T>?
}

/**
 * @param value text which is being parsed
 * @param offset indicates how much of the string has been already parsed staring from the left
 */
data class Input(val value: String, val offset: Int = 0) {
    val unprocessed = value.substring(offset)
    fun consumed() = copy(offset = value.length)
}

/**
 * @param payload structured data representing parsed text
 * @param nextInput the original input with incremented `offset`
 */
data class Output<out T>(val payload: T, val nextInput: Input)
