
fun <T1, T2> inOrder(parser1: Parser<T1>, parser2: Parser<T2>) =
    object : Parser<List2<T1, T2>> {
        override fun parse(input: Input): Output<List2<T1, T2>>? {
            val (output1, nextInput1) = parser1.parse(input) ?: return null
            val (output2, nextInput2) = parser2.parse(nextInput1) ?: return null
            return Output(List2(output1, output2), nextInput2)
        }
    }

fun <T1, T2, T3> inOrder(parser1: Parser<T1>, parser2: Parser<T2>, parser3: Parser<T3>) =
    object : Parser<List3<T1, T2, T3>> {
        override fun parse(input: Input): Output<List3<T1, T2, T3>>? {
            val (output1, nextInput1) = parser1.parse(input) ?: return null
            val (output2, nextInput2) = parser2.parse(nextInput1) ?: return null
            val (output3, nextInput3) = parser3.parse(nextInput2) ?: return null
            return Output(List3(output1, output2, output3), nextInput3)
        }
    }
