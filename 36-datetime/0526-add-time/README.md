# 0526 — Add time

Parse the fixed datetime `2026-06-15T10:00` with `kotlinx.datetime` (`LocalDateTime.parse`), then add 90 minutes by converting to an `Instant` in UTC and using `Instant.plus(90.minutes)`. The result is converted back to a `LocalDateTime` and formatted as `HH:mm`, yielding `11:30`. Anchoring the arithmetic in UTC keeps it independent of the OS timezone database.

## Run

    kotlin AddTime.main.kts
