# 0080 — Deduplicate

Remove duplicates from `1, 2, 2, 3, 1`, keeping the first occurrence of each in order, and print `1 2 3`. `distinct()` returns the list with duplicates removed, keeping the first occurrence of each in order.

## Run

    kotlinc Deduplicate.kt -include-runtime -d dedup.jar && java -jar dedup.jar
