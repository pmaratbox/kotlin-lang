# 0170 — Index By Key

Index people [(1,alice),(2,bob)] by id into a map, look up id 2, and print `id 2: bob`. `associate` turns each pair into a map entry for O(1) lookup.

## Run

    kotlinc ByKey.kt -include-runtime -d bykey.jar && java -jar bykey.jar
