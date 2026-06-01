# 0053 — Binary Search

Binary-search the sorted array `1, 3, 5, 7, 9` for `7` and print the index where it is found: `found 7 at index 3`. An `if`/`else if` chain drives the search over an `IntArray`. The stdlib provides `List.binarySearch` and `IntArray.binarySearch`.

## Run

    kotlinc BinarySearch.kt -include-runtime -d binsearch.jar && java -jar binsearch.jar
