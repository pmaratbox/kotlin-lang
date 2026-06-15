@file:DependsOn("org.jetbrains.kotlinx:kotlinx-collections-immutable-jvm:0.3.8")

import kotlinx.collections.immutable.persistentListOf

val original = persistentListOf(1, 2, 3)
val updated = original.set(0, 99)

println(updated.joinToString(" "))
println(original.joinToString(" "))
