# 0470 — Boolean flag

Define a boolean flag `--verbose` using the real Clikt CLI library (`com.github.ajalt.clikt:clikt-jvm`). The `option("--verbose").flag()` builder turns the option into a switch that is `true` when present and `false` otherwise. For determinism the program parses a fixed, hardcoded argv `arrayOf("--verbose")` instead of the real process arguments, so it always prints the lowercase boolean `true`.

## Run

    kotlin BooleanFlag.main.kts
