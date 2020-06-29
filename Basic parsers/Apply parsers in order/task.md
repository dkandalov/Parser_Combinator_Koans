## Combine parsers in order

To complete this task, implement `inOrder()` functions to return parser which sequentially uses `parser1`, `parser2` (and `parser3`) to proces input. If any of the parsers can't consume input, the overall result is `null`.

It might be easier to implement the functionality by looking at the following tests and making them pass one by one:
 - <a href="psi_element://Task2Tests#1 - no match">no match</a>
 - <a href="psi_element://Task2Tests#2 - full match with two parsers">full match with two parsers</a>
 - <a href="psi_element://Task2Tests#3 - full match with three parsers">full match with three parsers</a>

At this point, it's fair to say that we have a [parser combinator](https://en.wikipedia.org/wiki/Parser_combinator) which is a fancy name for parser which delegates to other parsers (you can also think about it as a [higher-order function](https://en.wikipedia.org/wiki/Higher-order_function) or [composite pattern](https://en.wikipedia.org/wiki/Composite_pattern)).
