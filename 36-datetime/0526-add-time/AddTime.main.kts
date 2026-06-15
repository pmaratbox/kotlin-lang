@file:DependsOn("org.jetbrains.kotlinx:kotlinx-datetime-jvm:0.6.1")

import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toInstant
import kotlinx.datetime.toLocalDateTime
import kotlin.time.Duration.Companion.minutes

// Fixed datetime (never the current time): 2026-06-15T10:00.
val start = LocalDateTime.parse("2026-06-15T10:00")

// Add 90 minutes via the library, anchored in UTC so the arithmetic
// is independent of the OS timezone database.
val added = start
    .toInstant(TimeZone.UTC)
    .plus(90.minutes)
    .toLocalDateTime(TimeZone.UTC)

// Format as HH:mm.
val hh = added.hour.toString().padStart(2, '0')
val mm = added.minute.toString().padStart(2, '0')
println("$hh:$mm")
