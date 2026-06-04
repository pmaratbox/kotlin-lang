# 0207 — Composite

Sum a composite tree of leaf values 1, 2, 3 through a uniform size() interface, printing `6`. Leaves and composites share one `Component` interface, and `sumOf` aggregates children.

## Run

    kotlinc Composite.kt -include-runtime -d composite.jar && java -jar composite.jar
