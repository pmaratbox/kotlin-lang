# 0153 — Comparable Sort

Sort people [(alice,30),(bob,25)] by age ascending and print their names `bob alice`. Implementing `Comparable<Person>` with `compareTo` lets `sorted()` order the list by age.

## Run

    kotlinc Sort.kt -include-runtime -d sort.jar && java -jar sort.jar
