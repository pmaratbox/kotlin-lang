# 0521 — Parse & format

Using `kotlinx-datetime`, parse the fixed ISO date `2026-06-15` with `LocalDate.parse` and format it back to ISO (`yyyy-MM-dd`) via `LocalDate.toString()`. The value is computed by the library round-trip rather than hardcoded, and no current-time or OS timezone data is used.

## Run

    kotlin ParseAndFormat.main.kts
