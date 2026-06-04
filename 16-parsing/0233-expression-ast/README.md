# 0233 — Expression AST

Build an AST for "1+2*3" and evaluate it to `7`. A sealed interface with `Num`/`Add`/`Mul` nodes gives each a recursive `eval`.

## Run

    kotlinc ExpressionAst.kt -include-runtime -d expressionast.jar && java -jar expressionast.jar
