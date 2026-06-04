# 0311 — BST Delete

Insert 5,3,8,1,4 into a BST, delete 3, and print the in-order traversal `1 4 5 8`. Kotlin rebuilds the node with its in-order successor using the two-child rule.

## Run

    kotlinc BstDelete.kt -include-runtime -d bstdelete.jar && java -jar bstdelete.jar
