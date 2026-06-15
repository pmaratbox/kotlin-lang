@file:DependsOn("org.jetbrains.kotlinx:kotlinx-collections-immutable-jvm:0.3.8")
import kotlinx.collections.immutable.persistentMapOf

// Immutable map {user: {age: 30}}
val original = persistentMapOf("user" to persistentMapOf("age" to 30))

// Update the nested user.age to 31: rebuild the inner persistent map and .put it.
// This RETURNS A NEW map; `original` stays unchanged.
val innerUpdated = original.getValue("user").put("age", 31)
val updated = original.put("user", innerUpdated)

println(updated.getValue("user").getValue("age"))   // 31  (new)
println(original.getValue("user").getValue("age"))  // 30  (original unchanged)
