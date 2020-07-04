
fun <T1, T2> inOrder(parser1: Parser<T1>, parser2: Parser<T2>) =
    object : Parser<Pair<T1, T2>> {
        override fun parse(input: Input): Output<Pair<T1, T2>>? {
            TODO()
        }
    }

fun <T1, T2, T3> inOrder(parser1: Parser<T1>, parser2: Parser<T2>, parser3: Parser<T3>) =
    object : Parser<Triple<T1, T2, T3>> {
        override fun parse(input: Input): Output<Triple<T1, T2, T3>>? {
            TODO()
        }
    }
