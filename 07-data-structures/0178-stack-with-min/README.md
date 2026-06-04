# 0178 — Stack With Min

Build a stack that tracks its minimum in O(1); after pushing 3,1,2 print `min: 1`. An auxiliary `mins` deque carries the running minimum alongside each push.

## Run

    kotlinc WithMin.kt -include-runtime -d withmin.jar && java -jar withmin.jar
