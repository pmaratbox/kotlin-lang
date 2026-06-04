# 0295 — Equal Partition

Decide whether [1,5,11,5] can split into two equal-sum subsets, printing `yes`. Reducing to a subset-sum on half the total leans on Kotlin's `sum()` for the early parity check.

## Run

    kotlinc PartitionEqualSubset.kt -include-runtime -d partitionequalsubset.jar && java -jar partitionequalsubset.jar
