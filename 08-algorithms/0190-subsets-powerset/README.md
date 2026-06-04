# 0190 — Subsets (Power Set)

Generate the power set of [1,2,3] in bitmask order 0..7 (empty printed as `{}`), one subset per line space-separated. For mask 0..7, include element i when bit i is set via `filterIndexed`; empty set prints {}.

## Run

    kotlinc Powerset.kt -include-runtime -d powerset.jar && java -jar powerset.jar
