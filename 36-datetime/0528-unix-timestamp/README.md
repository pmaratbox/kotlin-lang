# 0528 — Unix timestamp

Using `kotlinx-datetime`, parse the fixed UTC instant `2026-06-15T00:00:00Z` with `Instant.parse` (ISO-8601, the trailing `Z` being the `+00:00` offset) and read its `epochSeconds` to get the Unix timestamp. The library computes the value `1781481600` — it is not hardcoded.

## Run

    kotlin UnixTimestamp.main.kts
