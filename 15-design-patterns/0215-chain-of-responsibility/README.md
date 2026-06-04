# 0215 — Chain of Responsibility

Pass a request of level 2 along a handler chain so the level-2 handler handles it, printing `handled by 2`. Each handler keeps a nullable `next` and forwards with the safe-call operator when it cannot handle.

## Run

    kotlinc ChainOfResponsibility.kt -include-runtime -d chainofresponsibility.jar && java -jar chainofresponsibility.jar
