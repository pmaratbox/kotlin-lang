# 0538 — Sequence

Using the `jparsec` parser-combinator library, we build two single-character parsers and combine them with the `Parsers.sequence` combinator, which runs the first parser THEN the second and merges their results. Parsing the fixed input `ab` yields the two characters concatenated back into the string `ab`.

## Run

    kotlin Sequence.main.kts
