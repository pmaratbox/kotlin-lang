@file:DependsOn("org.jetbrains.kotlinx:kotlinx-datetime-jvm:0.6.1")

import kotlinx.datetime.LocalDate
import kotlinx.datetime.isoDayNumber

// Parse a FIXED ISO date and read its ISO weekday number (Mon=1 .. Sun=7).
// dayOfWeek.isoDayNumber is already ISO, so no conversion is needed.
val date = LocalDate.parse("2026-06-15")
println(date.dayOfWeek.isoDayNumber)
