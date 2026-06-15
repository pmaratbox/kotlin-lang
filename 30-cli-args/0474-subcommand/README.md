# 0474 — Subcommand

Dispatch to a subcommand using the real `clikt` library: a root `CliktCommand` registers an `add` subcommand via `.subcommands()`, where `add` declares two integer positionals with `argument().int()`. The parser routes a fixed hardcoded argv `["add", "2", "3"]` (not the real process args, so output is deterministic) to the `add` subcommand, which sums the arguments and prints `5`.

## Run

    kotlin Subcommand.main.kts
