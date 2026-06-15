@file:DependsOn("org.jetbrains.kotlinx:kotlinx-datetime-jvm:0.6.1")

import kotlinx.datetime.LocalDate
import kotlinx.datetime.daysUntil

// Two FIXED dates parsed from ISO-8601 strings (never the current date).
val start = LocalDate.parse("2026-06-15")
val end = LocalDate.parse("2026-07-15")

// The library computes the day difference; nothing is hardcoded.
val days = start.daysUntil(end)
println(days)
