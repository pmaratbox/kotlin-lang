# 0164 — Merge Maps

Merge {a:1,b:2} and {b:3,c:4} with the right map winning on conflicts, printing `a:1 b:3 c:4`. The `+` operator on maps is right-biased on key conflicts.

## Run

    kotlinc Merge.kt -include-runtime -d merge.jar && java -jar merge.jar
