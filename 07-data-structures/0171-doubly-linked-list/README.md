# 0171 — Doubly Linked List

Build a doubly linked list 1<->2<->3, traverse forward then backward, printing `1 2 3` then `3 2 1` on two lines. Each `Node` holds a nullable `prev`/`next`, so a smart-cast drives the `while` cursor in both directions.

## Run

    kotlinc LinkedList.kt -include-runtime -d linkedlist.jar && java -jar linkedlist.jar
