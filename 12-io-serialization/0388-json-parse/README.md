# 0388 — JSON Parse

Parse the JSON object `{"x":1,"y":2}` and print its entries `x=1 y=2`. Splitting on delimiters and mapping to pairs keeps the hand-parser idiomatic.

## Run

    kotlinc JsonParse.kt -include-runtime -d jsonparse.jar && java -jar jsonparse.jar
