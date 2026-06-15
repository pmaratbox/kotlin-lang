@file:DependsOn("org.jetbrains.kotlinx:kotlinx-datetime-jvm:0.6.1")

import kotlinx.datetime.LocalDate

// Fixed date — never the current time.
val date = LocalDate.parse("2026-06-15")

// Extract components via the library's accessors.
println(date.year)
println(date.monthNumber)
println(date.dayOfMonth)
