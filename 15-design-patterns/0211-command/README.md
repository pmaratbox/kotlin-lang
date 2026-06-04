# 0211 — Command (Undo)

Execute an AddCommand that takes a counter from 0 to 5, then undo it back to 0, printing `5 0`. The command bundles `execute()`/`undo()` over a mutable counter object.

## Run

    kotlinc Command.kt -include-runtime -d command.jar && java -jar command.jar
