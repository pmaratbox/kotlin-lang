# 0030 — Variadic Functions

Define a function that accepts a variable number of integer arguments and returns their total, then call it with `1, 2, 3` to print `sum: 6`. The `vararg nums: Int` parameter collects the arguments into an `IntArray`, summed with `.sum()`. An existing array is forwarded with the spread operator: `total(*arr)`.

## Run

    kotlinc Variadic.kt -include-runtime -d variadic.jar && java -jar variadic.jar
