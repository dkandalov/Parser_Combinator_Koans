## Evaluate expression

There is no need to write any code in this task. The main point here is that once the input is transformed into syntax tree, it's easy to write `evalute()` function for it.

You can also take a look at the <a href="psi_element://Task11Tests">tests</a> to make sure the calculation is correct.

## Final words
At this point you should have a simple parser and a way to evaluate expressions like "(1 + 2) * 3 - 4". It shouldn't be too hard to add `Divide` operation or switch from `Int` to `BigDecimal`. However, there are a couple fundamental problems with it:
 - perfomance - the call tree produced by the parser will have many overlaps computing output at the same input offset multiple times
 - left-associative operators readibility - unfortunately we can't just write `val plus = inOrder(expr, plusToken, expr)`
 - operator precedence readibility - well, it depends on the code you wrote, but the most intuitive approach is usually verbose

There are solutions to the above problems. Try to find them yourself... sorry :)

I hope you enjoyed these koans! You can find the source code [in this repository](https://github.com/dkandalov/Parser_Combinator_Koans). Please feel free to raise any [issues](https://github.com/dkandalov/Parser_Combinator_Koans/issues) or give it a star.