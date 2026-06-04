# 0216 — Mediator

Have colleague A send "hi" through a mediator to colleague B, which prints `B got: hi`. Colleagues hold only a reference to the mediator, which routes the message to B.

## Run

    kotlinc Mediator.kt -include-runtime -d mediator.jar && java -jar mediator.jar
