# 0214 — Visitor

Use a visitor to sum the values of a small node tree with leaves 1, 2, 3, printing `6`. Overloaded `visit` methods plus `accept` give double dispatch over the element hierarchy.

## Run

    kotlinc Visitor.kt -include-runtime -d visitor.jar && java -jar visitor.jar
