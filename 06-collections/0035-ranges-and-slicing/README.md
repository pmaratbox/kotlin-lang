# 0035 — Ranges & Slicing

From the list `[10, 20, 30, 40, 50]`, take the sub-sequence at indices 1 through 4 (exclusive) and print `slice: 20 30 40`. `subList(1, 4)` returns a half-open view (inherited from Java), while `slice(1..3)` takes an inclusive `IntRange` and returns a new list. Kotlin ranges are first-class values (`1..3`, `1 until 4`).

## Run

    kotlinc Ranges.kt -include-runtime -d ranges.jar && java -jar ranges.jar
