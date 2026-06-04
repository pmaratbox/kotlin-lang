# 0118 — Option Map Chaining

Map a function over a present optional (10 -> 12) and an absent one (-> fallback), printing `12 none`. Kotlin nullable types use `?.let` to map and `?:` to supply the fallback.

## Run

    kotlinc MapChain.kt -include-runtime -d mapchain.jar && java -jar mapchain.jar
