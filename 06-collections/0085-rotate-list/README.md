# 0085 — Rotate a List

Rotate the list `1, 2, 3, 4, 5` left by `2` positions (elements wrap to the end) and print it: `3 4 5 1 2`. `drop(k)` (tail) plus `take(k)` (head) concatenates into the left-rotated list.

## Run

    kotlinc RotateList.kt -include-runtime -d rotate.jar && java -jar rotate.jar
