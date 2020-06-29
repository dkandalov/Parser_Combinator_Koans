### Plus parser

To complete this task, assign to `PlusGrammar.expression` a parser which produces <a href="psi_element://IntLiteral">IntLiteral</a> or <a href="psi_element://Plus">Plus</a>. This should be achievable by combining parsers from the previous tasks.

It might be easier to implement the functionality by looking at the following tests and making them pass one by one:
 - <a href="psi_element://Task6Tests#1 - parse number">parse number</a>
 - <a href="psi_element://Task6Tests#2 - add two numbers">add two numbers</a>
 - <a href="psi_element://Task6Tests#3 - add three numbers">add three numbers</a> (right associative)

The parsers in this task are all defined inside `PlusGrammar` object. In theory, we could use a function and define parsers as local variables. However, we can't reference local variables defined on the following lines, but can forward-reference fields, e.g. with `ref { expression }`. This task can be completed without forward-references, but they will be useful later.

<div class="hint">
  If you get a chance, try running this code:<br/>
  inOrder(ref { expression }, string(" + "), ref { expression })
</div>

After finishing the task, you should have the first somewhat realistic parser which consumes a string and produces [abstract syntax tree](https://en.wikipedia.org/wiki/Abstract_syntax_tree).