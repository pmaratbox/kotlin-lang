# 0523 — Difference in days

Using `kotlinx-datetime`, parse two fixed ISO-8601 dates with `LocalDate.parse`
and compute the whole number of days between them via `LocalDate.daysUntil`.
The dates are fixed (`2026-06-15` to `2026-07-15`) so the result is
deterministic, and the count is produced by the library rather than hardcoded.

## Run

    kotlin DifferenceDays.main.kts
