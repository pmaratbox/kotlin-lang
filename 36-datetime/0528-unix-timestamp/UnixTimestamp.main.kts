@file:DependsOn("org.jetbrains.kotlinx:kotlinx-datetime-jvm:0.6.1")

import kotlinx.datetime.Instant

// Parse a FIXED UTC instant (ISO-8601, Z = +00:00 offset) and ask the
// library for its Unix timestamp in epoch SECONDS.
val instant = Instant.parse("2026-06-15T00:00:00Z")
println(instant.epochSeconds)
