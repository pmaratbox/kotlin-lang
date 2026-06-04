# 0130 — Format ISO Date

Format the date y=2026, m=6, d=4 as a zero-padded ISO string `2026-06-04`. Kotlin's `String.format` with `%02d` handles the zero padding.

## Run

    kotlinc IsoDate.kt -include-runtime -d isodate.jar && java -jar isodate.jar
