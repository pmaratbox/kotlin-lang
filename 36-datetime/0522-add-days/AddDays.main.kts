@file:DependsOn("org.jetbrains.kotlinx:kotlinx-datetime-jvm:0.6.1")

import kotlinx.datetime.LocalDate
import kotlinx.datetime.DatePeriod
import kotlinx.datetime.plus

// Fixed date — never the current day.
val start = LocalDate.parse("2026-06-15")

// Add 10 days using the library's calendar period arithmetic.
val result = start.plus(DatePeriod(days = 10))

// Format back to ISO-8601 (yyyy-MM-dd).
println(result)
