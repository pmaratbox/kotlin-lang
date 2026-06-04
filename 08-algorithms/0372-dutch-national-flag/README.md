# 0372 — Dutch National Flag

Three-way partition [2,0,2,1,1,0] of values 0/1/2 in one pass, printing `0 0 1 1 2 2`. A `when` on the mid element drives the low/mid/high pointer swaps.

## Run

    kotlinc DutchNationalFlag.kt -include-runtime -d dutchnationalflag.jar && java -jar dutchnationalflag.jar
