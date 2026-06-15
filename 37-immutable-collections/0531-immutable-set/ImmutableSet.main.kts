@file:DependsOn("org.jetbrains.kotlinx:kotlinx-collections-immutable-jvm:0.3.8")

import kotlinx.collections.immutable.persistentSetOf

// A persistent set: .add returns a NEW set; the original is unchanged.
val original = persistentSetOf(1, 2, 3)
val updated = original.add(4)
println(updated.size)
println(original.size)
