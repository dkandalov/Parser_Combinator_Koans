## Plus/minus parser

To complete this koan, assign to `PlusMinusGrammar.expression` a parser
which produces `IntLiteral`, `Plus` or `Minus`. Note that both `Plus` and `Minus` operations are left-associative.
(It's ok to copy-paste some code from the previous koan.)

At this point, `PlusMinusGrammar` object should more or less justify being called "grammar"
by looking somewhat similar to grammars expressed in
[Backus–Naur form](https://en.wikipedia.org/wiki/Backus%E2%80%93Naur_form).

It might be easier to implement the functionality by looking at the following tests and making them pass one by one:
 - <a href="psi_element://Task8Tests#1 - subtract two numbers">subtract two numbers</a>
 - <a href="psi_element://Task8Tests#2 - add two numbers">add two numbers</a>
 - <a href="psi_element://Task8Tests#3 - subtract three numbers">subtract three numbers</a>
 - <a href="psi_element://Task8Tests#4 - add three numbers">add three numbers</a>
 - <a href="psi_element://Task8Tests#5 - add and subtract">add and subtract</a>
