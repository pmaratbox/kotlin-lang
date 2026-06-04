# 0342 — Tagged Union Eval

Model an expression tagged union Num | Add and evaluate Add(Num 1, Num 2), printing `3`. A `sealed interface` with an exhaustive `when` models the variants and recurses to fold the tree.

## Run

    kotlinc TaggedUnionEval.kt -include-runtime -d taggedunioneval.jar && java -jar taggedunioneval.jar
