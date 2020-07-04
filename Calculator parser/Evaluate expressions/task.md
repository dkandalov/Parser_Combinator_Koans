## Evaluate expression

At this point you should have a simple parser and a way to evaluate expressions like `(1 + 2) * 3 - 4`.
It shouldn't be too hard to add `Divide` operation or switch from `Int` to `BigDecimal`.

However, there are a couple fundamental problems with it:
 - performance - the call tree produced by the parser will have many overlaps
   computing output at the same input offset multiple times (you try making pass the bonus test below)
 - left-associative operators readability - unfortunately, because of the left recursion we can't just write
   `val plus = inOrder(expr, plusToken, expr)` and have to do awkward folds
 - operator precedence readability - well, it depends on the code you wrote,
   but the most intuitive approach for dealing with precedence is usually verbose

There are solutions to the above problems.
Try to find them yourself... sorry :)

I hope you enjoyed these koans! You can find the source code 
[in this repository](https://github.com/dkandalov/Parser_Combinator_Koans). 
Please feel free to raise any [issues](https://github.com/dkandalov/Parser_Combinator_Koans/issues) or give it a star.