@file:DependsOn("org.jetbrains.kotlinx:kotlinx-datetime-jvm:0.6.1")

import kotlinx.datetime.Instant
import kotlinx.datetime.UtcOffset
import kotlinx.datetime.FixedOffsetTimeZone
import kotlinx.datetime.toLocalDateTime

// Fixed instant (never the current time): 2026-06-15T12:00:00Z.
val instant = Instant.parse("2026-06-15T12:00:00Z")

// Convert to a FIXED offset of +05:00 (no named tz / OS tzdata).
val zone = FixedOffsetTimeZone(UtcOffset(hours = 5))
val local = instant.toLocalDateTime(zone)

// 12:00 UTC + 5h -> local hour 17. Computed by the library.
println(local.hour)
