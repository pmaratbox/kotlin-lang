# 0039 — Records & Value Equality

Create two points with the same fields, print one as `point: (1, 2)`, and compare them by value to print `equal: yes`. A `data class` generates `equals`, `hashCode`, `toString`, and `copy` from the primary-constructor properties. Kotlin's `==` calls `equals`, so the two points compare equal by value.

## Run

    kotlinc Records.kt -include-runtime -d records.jar && java -jar records.jar
