# 0224 — Shunting Yard

Convert the infix expression "3 + 4 * 2" to postfix `3 4 2 * +`. A precedence map drives Dijkstra's algorithm using an `ArrayDeque` operator stack.

## Run

    kotlinc ShuntingYard.kt -include-runtime -d shuntingyard.jar && java -jar shuntingyard.jar
