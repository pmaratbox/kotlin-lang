# 0364 — Double-Ended Queue

Using a deque, push 1 and 2 to the back and 0 to the front, then print front-to-back `0 1 2`. Kotlin's stdlib ArrayDeque offers addFirst/addLast and iterates front-to-back.

## Run

    kotlinc Deque.kt -include-runtime -d deque.jar && java -jar deque.jar
