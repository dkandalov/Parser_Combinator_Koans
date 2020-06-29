fun ASTNode?.evaluate(): Int =
    when (this) {
        is IntLiteral -> value
        is Plus -> left.evaluate() + right.evaluate()
        is Minus -> left.evaluate() - right.evaluate()
        is Multiply -> left.evaluate() * right.evaluate()
        else -> error("Expected '$this' to be an Expression")
    }
