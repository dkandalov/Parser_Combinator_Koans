## Apply first matching pattern

To complete this task, implement `oneOf()` function to return parser which tries all `parsers` and applies the first one which was able to consume input, or `null` if none of the `parsers` match.

It might be easier to implement the functionality by looking at the following tests and making them pass one by one:
 - <a href="psi_element://Task3Tests#1 - no match">no match</a>
 - <a href="psi_element://Task3Tests#2 - full match first parser">full match first parser</a>
 - <a href="psi_element://Task3Tests#3 - full match second parser">full match second parser</a>
 - <a href="psi_element://Task3Tests#4 - full match third parser">full match third parser</a>
