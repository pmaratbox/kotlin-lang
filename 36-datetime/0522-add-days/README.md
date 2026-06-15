# 0522 — Add days

Using `kotlinx-datetime`, parse the fixed date `2026-06-15` into a `LocalDate`,
then add 10 days with calendar arithmetic via `LocalDate.plus(DatePeriod(days = 10))`.
The library computes the resulting date, which is printed in ISO-8601 form.

## Run

    kotlin AddDays.main.kts
