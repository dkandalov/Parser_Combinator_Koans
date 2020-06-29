## Parser API

In software, [parser](https://en.wikipedia.org/wiki/Parsing#Computer_languages) is a component which converts text into a more structured data format (usually [abstract syntax tree](https://en.wikipedia.org/wiki/Abstract_syntax_tree)). Therefore, it's reasonable to think about parser being a function which takes input as plain text and produces some kind of structured output. 

In these koans, <a href="psi_element://Parser">Parser</a> is an `interface` with a single function which takes <a href="psi_element://Input">Input</a> data class, "consumes" part of it left-to-right and returns <a href="psi_element://Output">Output</a> if the parser was able to consume part of the input or `null` otherwise.

<a href="psi_element://Input">Input</a> is a wrapper around `String` with `offset` to keep track of how much of the string has been already parsed starting from the left. Instead of using `offset` we could've done something like `input.value.substring(tokenLength)` but then we would lose the original input string which can be useful for debugging.

<a href="psi_element://Output">Output</a> is a wrapper around `payload`  and the `nextInput`, where `payload` is the main point of parsing and the `nextInput` is the original input with the `offset` shifted right ready to be processed by the next parser. 
