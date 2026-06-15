@file:DependsOn("org.jetbrains.kotlinx:kotlinx-collections-immutable-jvm:0.3.8")
import kotlinx.collections.immutable.persistentListOf

val original = persistentListOf(2, 3)
val result = original.add(0, 1).add(4)
println(result.joinToString(" "))
