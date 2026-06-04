# 0121 — Parse CSV

Parse the two CSV rows `alice,30` and `bob,25` into name=value pairs and print `alice=30 bob=25`. A destructuring declaration unpacks each comma-split row into `name` and `value`.

## Run

    kotlinc Parse.kt -include-runtime -d parse.jar && java -jar parse.jar
