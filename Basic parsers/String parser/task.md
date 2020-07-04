## String parser

To complete this koan, implement `string()` function to return parser
which consumes `Input` if it starts with the specified `value`.

This parser can seem a bit pointless because `Output` with `String`
as a payload is not much more structured than the input,
but it's a building block for the other parsers and will make more sense later.

It might be easier to implement the functionality by looking at the following tests and making them pass one by one:
 - <a href="psi_element://Task1Tests#1 - no match">no match</a>
 - <a href="psi_element://Task1Tests#2 - full match">full match</a>
 - <a href="psi_element://Task1Tests#3 - prefix match">prefix match</a>
 - <a href="psi_element://Task1Tests#4 - postfix match">postfix match</a>
