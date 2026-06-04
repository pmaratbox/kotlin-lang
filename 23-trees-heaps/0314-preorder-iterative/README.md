# 0314 — Iterative Preorder

Print the iterative (stack-based) preorder traversal of the BST built from 5,3,8,1,4 `5 3 1 4 8`. Kotlin's built-in `ArrayDeque` serves as the explicit stack via `addLast`/`removeLast`.

## Run

    kotlinc PreorderIterative.kt -include-runtime -d preorderiterative.jar && java -jar preorderiterative.jar
