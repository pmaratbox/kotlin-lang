# 0044 — Generic Constraints

Write a generic `largest(a, b)` that requires an ordered type, then call it on integers (3 and 9) and on strings (apple and pear), printing `9` and `pear`. The upper bound `<T : Comparable<T>>` requires `T` to be comparable, which lets the `>` operator (sugar for `compareTo`) apply. Without the bound the comparison would not compile.

## Run

    kotlinc GenericConstraints.kt -include-runtime -d generics.jar && java -jar generics.jar
