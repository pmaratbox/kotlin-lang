@file:DependsOn("org.jetbrains.kotlinx:kotlinx-collections-immutable-jvm:0.3.8")

import kotlinx.collections.immutable.persistentSetOf

val a = persistentSetOf(1, 2, 3)
val b = persistentSetOf(3, 4, 5)

// Union returns a NEW persistent set; `a` and `b` are unchanged.
val union = a.addAll(b)

println(union.sorted().joinToString(" "))
