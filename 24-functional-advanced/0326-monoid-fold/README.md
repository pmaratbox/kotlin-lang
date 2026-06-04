# 0326 — Monoid Fold

Fold lists under two monoids: string concat ["a","b","c"]->"abc" and integer sum [1,2,3]->6, printing `abc 6`. A generic `foldMonoid` takes an identity and a combine op for any type.

## Run

    kotlinc MonoidFold.kt -include-runtime -d monoidfold.jar && java -jar monoidfold.jar
