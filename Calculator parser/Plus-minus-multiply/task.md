## Plus/minus/multiply parser

To complete this koan, assign to `PlusMinusMultGrammar.expression` a parser which produces
`IntLiteral`, `Plus`, `Minus` or `Multiply`. (It's ok to copy-paste some code from the previous koan.)

Just like the parser from the previous koan, this parser should be able to parse `Plus` and `Minus`
with left-associativity. But in addition, it should be able to parse `Multiply` with higher operator precedence
(i.e. just like in mathematics multiplication is processed/calculated first).

It might be easier to implement the functionality by looking at the following tests and making them pass one by one:
 - <a href="psi_element://Task9Tests#1 - add and subtract">add and subtract</a>
 - <a href="psi_element://Task9Tests#2 - multiply three numbers">multiply three numbers</a>
 - <a href="psi_element://Task9Tests#3 - add and multiply">add and multiply</a>

<div class="hint">
  The "val expression = oneOf(plusOrMinus, multiply, number)" can almost be used for specifying operator precedence, especially if operator parsers refer to expression itself... or something along these lines.
</div>