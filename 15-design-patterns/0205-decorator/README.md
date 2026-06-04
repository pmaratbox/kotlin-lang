# 0205 — Decorator

Decorate a base coffee (cost 2) with milk (+1) and sugar (+1), printing the total cost `4`. Each decorator wraps a `Coffee` and delegates to the inner component's `cost()`.

## Run

    kotlinc Decorator.kt -include-runtime -d decorator.jar && java -jar decorator.jar
