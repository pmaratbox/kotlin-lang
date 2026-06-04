# 0219 — Bridge

Bridge a Circle abstraction to a Red color implementation, printing `red circle`. The `Shape` abstraction holds a `Color` implementor, decoupling the two hierarchies.

## Run

    kotlinc Bridge.kt -include-runtime -d bridge.jar && java -jar bridge.jar
