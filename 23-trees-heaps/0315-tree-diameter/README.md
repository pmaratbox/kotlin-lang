# 0315 — Tree Diameter

Compute the diameter (longest path in edges) of a tree where root has children A and B, and A has children C and D, printing `3`. Kotlin tracks the best left+right sum in a top-level `var` updated during the height recursion.

## Run

    kotlinc TreeDiameter.kt -include-runtime -d treediameter.jar && java -jar treediameter.jar
