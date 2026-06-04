# 0179 — Union-Find

Union (0,1) and (2,3), then query connectivity of (0,1)=yes and (0,2)=no, printing `yes no`. A disjoint-set over an `IntArray` of parents uses recursive `find` with path compression.

## Run

    kotlinc Find.kt -include-runtime -d find.jar && java -jar find.jar
