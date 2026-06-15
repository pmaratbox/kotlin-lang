@file:DependsOn("org.jetbrains.kotlinx:kotlinx-collections-immutable-jvm:0.3.8")
import kotlinx.collections.immutable.persistentMapOf

val original = persistentMapOf("a" to 1)
val updated = original.put("b", 2)

println(updated.keys.sorted().joinToString(" "))
println(original.keys.sorted().joinToString(" "))
