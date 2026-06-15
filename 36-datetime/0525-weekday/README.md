# 0525 — Weekday

Using `kotlinx-datetime`, parse the fixed ISO date `2026-06-15` with `LocalDate.parse` and read its ISO weekday number via `dayOfWeek.isoDayNumber` (Monday=1 .. Sunday=7). The number is computed by the library and is already ISO, so no conversion is needed, and no current-time or OS timezone data is used.

## Run

    kotlin Weekday.main.kts
