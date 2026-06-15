@file:DependsOn("org.jetbrains.kotlinx:kotlinx-collections-immutable-jvm:0.3.8")
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.toPersistentList

val original = persistentListOf(1, 2, 3, 4, 5)

// filter returns a NEW immutable list; map returns another NEW immutable list.
val result = original.filter { it % 2 == 0 }.map { it * 10 }.toPersistentList()

println(result.joinToString(" "))
