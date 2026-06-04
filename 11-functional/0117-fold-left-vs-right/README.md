# 0117 — Fold Left vs Right

Fold subtraction over [1,2,3] from 0 both ways: left ((((0-1)-2)-3)) = -6 and right (1-(2-(3-0))) = 2, printing `-6 2`. Kotlin's `fold` and `foldRight` differ in associativity and argument order.

## Run

    kotlinc LeftVsRight.kt -include-runtime -d leftvsright.jar && java -jar leftvsright.jar
