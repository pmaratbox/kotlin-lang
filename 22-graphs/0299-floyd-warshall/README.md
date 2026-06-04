# 0299 — Floyd-Warshall

Run all-pairs shortest paths on 0->1(3),1->2(1),0->2(5) and print the distance from 0 to 2 `4`. A triple `for` over `k,i,j` fills the DP matrix in place.

## Run

    kotlinc FloydWarshall.kt -include-runtime -d floydwarshall.jar && java -jar floydwarshall.jar
