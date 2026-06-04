# 0313 — Level-Order Traversal

Print the breadth-first (level-order) traversal of the BST built from 5,3,8,1,4 `5 3 8 1 4`. Kotlin uses a `java.util.ArrayDeque` as the BFS queue with `?.let` for null-safe enqueueing.

## Run

    kotlinc LevelOrderTraversal.kt -include-runtime -d levelordertraversal.jar && java -jar levelordertraversal.jar
