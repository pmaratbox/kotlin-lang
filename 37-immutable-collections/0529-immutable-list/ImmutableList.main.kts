@file:DependsOn("org.jetbrains.kotlinx:kotlinx-collections-immutable-jvm:0.3.8")

import kotlinx.collections.immutable.persistentListOf

val original = persistentListOf(1, 2, 3)
val updated = original.add(4)

println(updated.joinToString(" "))
println(original.joinToString(" "))
