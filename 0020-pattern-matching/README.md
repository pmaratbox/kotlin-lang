# 0020 — Pattern Matching

Match `n` against the literal patterns `1` and `2` with a wildcard fallback, mapping `1`, `2`, and `5` to `one`, `two`, and `many`. `when` is Kotlin's pattern-match expression: branches are tested in order, `else` is the fallback, and the whole `when` yields a value (assigned via `=`). Branches can test values, ranges (`in 1..9`), types (`is String`), or arbitrary conditions.

## Run

    kotlinc PatternMatching.kt -include-runtime -d matching.jar && java -jar matching.jar
