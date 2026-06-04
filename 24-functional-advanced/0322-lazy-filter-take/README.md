# 0322 — Lazy Filter + Take

From a lazy stream of naturals, filter the even ones and take three, printing `2 4 6`. Sequence operations stay lazy until the terminal `take` pulls just enough.

## Run

    kotlinc LazyFilterTake.kt -include-runtime -d lazyfiltertake.jar && java -jar lazyfiltertake.jar
