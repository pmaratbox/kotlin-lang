# 0471 — Option with value

Uses the [Clikt](https://ajalt.github.io/clikt/) CLI library to define an
option `--name` that takes a string value. Instead of reading the real process
arguments, the program parses a fixed argv array `["--name", "alice"]` so the
output is deterministic, then prints the parsed value.

## Run

    kotlin OptionWithValue.main.kts
