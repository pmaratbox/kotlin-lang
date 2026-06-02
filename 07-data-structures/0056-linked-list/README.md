# 0056 — Linked List

Build a singly-linked list holding `1`, `2`, and `3`, then traverse it from head to tail and print `1 -> 2 -> 3`. `Node` has a `val value` and a nullable `next: Node?` (null at the tail); the cursor is `Node?`, so a smart-cast handles the null check inside the `while`.

## Run

    kotlinc LinkedList.kt -include-runtime -d linkedlist.jar && java -jar linkedlist.jar
