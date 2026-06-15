# 0469 — Positional argument

Define a CLI with a single positional argument `name` using the real `clikt` library: a `CliktCommand` declares the parameter with `argument()`, and `run()` prints it. For determinism the command parses a hardcoded argv array (`arrayOf("alice")`) instead of the real process arguments, so running the program always produces the same output.

## Run

    kotlin PositionalArgument.main.kts
