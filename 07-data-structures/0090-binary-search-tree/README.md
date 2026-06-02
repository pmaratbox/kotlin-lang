# 0090 — Binary Search Tree

Insert `5, 3, 8, 1, 4` into a binary search tree and print an in-order traversal (which yields the values in sorted order): `1 3 4 5 8`. `Node?` nullable links form the tree; `insert` recurses by comparison and the in-order walk collects the sorted values.

## Run

    kotlinc BinarySearchTree.kt -include-runtime -d bst.jar && java -jar bst.jar
