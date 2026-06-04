# 0147 — Deep Equality

Compare two nested structures with equal contents for structural equality and print `equal: yes`. Kotlin's `==` calls structural `equals`, which `Pair` implements recursively over its components.

## Run

    kotlinc Equality.kt -include-runtime -d equality.jar && java -jar equality.jar
