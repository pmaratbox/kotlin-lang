# 0476 — Choice option

Uses the [Clikt](https://ajalt.github.io/clikt/) CLI library to define an
option `--color` restricted to the choice set `{red, green, blue}` via Clikt's
`choice()` conversion. Instead of reading the real process arguments, the
program parses a fixed argv array `["--color", "green"]` so the output is
deterministic, then prints the chosen value.

## Run

    kotlin ChoiceOption.main.kts
