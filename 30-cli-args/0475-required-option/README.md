# 0475 — Required option

Declare a CLI option as required using the real `clikt` library: `option().int().required()` defines an integer `--id` flag that the parser refuses to omit, and `CliktCommand.run()` prints the parsed value. To stay deterministic the program parses a fixed hardcoded argv (`["--id", "42"]`) instead of the real process arguments, so running it always prints `42`.

## Run

    kotlin RequiredOption.main.kts
