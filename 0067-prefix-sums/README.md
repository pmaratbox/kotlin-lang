# 0067 — Prefix Sums

Compute the running totals (prefix sums) of `1, 2, 3, 4` — each element added to the sum of all the previous ones — and print them: `1 3 6 10`. `runningReduce` returns the cumulative results of folding with `+`; `runningFold` is the variant that takes an initial value.

## Run

    kotlinc PrefixSums.kt -include-runtime -d prefixsums.jar && java -jar prefixsums.jar
