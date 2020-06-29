## Minus parser

To complete this task, assign to `MinusGrammar.expression` a parser which produces <a href="psi_element://IntLiteral">IntLiteral</a> or <a href="psi_element://Minus">Minus</a>. This should be achievable by combining parsers from the previous tasks.

Note that unlike the previous task, `Minus` has to be left-associative (i.e the operations are grouped from the left to right).

It might be easier to implement the functionality by looking at the following tests and making them pass one by one:
 - <a href="psi_element://Task7Tests#1 - subtract two numbers">subtract two numbers</a>
 - <a href="psi_element://Task7Tests#2 - subtract three numbers">subtract three numbers</a> (left associative)
 - <a href="psi_element://Task7Tests#3 - subtract five numbers">subtract five numbers</a> (left associative)
