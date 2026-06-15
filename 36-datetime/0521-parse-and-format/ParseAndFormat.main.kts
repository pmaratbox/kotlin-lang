@file:DependsOn("org.jetbrains.kotlinx:kotlinx-datetime-jvm:0.6.1")

import kotlinx.datetime.LocalDate

// Parse a FIXED ISO date and format it back to ISO (yyyy-MM-dd).
// LocalDate.toString() emits the ISO-8601 representation.
val date = LocalDate.parse("2026-06-15")
println(date.toString())
