## Plus/minus/multiply with parens parser

To complete this koan, assign to `CalculatorGrammar.expression` a parser which produces
`IntLiteral`, `Plus`, `Minus` or `Multiply` and can handle parens by processing expressions inside parens first.
(It's ok to copy-paste some code from the previous koans.)

It might be easier to implement the functionality by looking at the following tests and making them pass one by one:
 - <a href="psi_element://Task10Tests#1 - number with parens">number with parens</a>
 - <a href="psi_element://Task10Tests#2 - binary operations with parens">binary operations with parens</a>
 - <a href="psi_element://Task10Tests#3 - change associativity with parens">change associativity with parens</a>
 - <a href="psi_element://Task10Tests#4 - change precedence with parens">change precedence with parens</a>
 