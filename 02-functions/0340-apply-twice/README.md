# 0340 — Apply Twice

Write applyTwice(f,x)=f(f(x)) and apply it with inc to 3, printing `5`. The higher-order function takes a `(Int) -> Int` lambda as its first parameter.

## Run

    kotlinc ApplyTwice.kt -include-runtime -d applytwice.jar && java -jar applytwice.jar
