# 0527 — Timezone offset

Using `kotlinx-datetime`, take the fixed instant `2026-06-15T12:00:00Z` (parsed with `Instant.parse`) and convert it to a wall-clock time at a **fixed** UTC offset of `+05:00` via `UtcOffset(hours = 5)` and `Instant.toLocalDateTime(offset)`. Using a fixed offset avoids any dependency on named timezones or the OS timezone database, and the resulting local hour (`17`) is computed by the library rather than hardcoded.

## Run

    kotlin TimezoneOffset.main.kts
