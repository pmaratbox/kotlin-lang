@file:DependsOn("io.konform:konform-jvm:0.4.0")

import io.konform.validation.Validation
import io.konform.validation.jsonschema.minLength
import io.konform.validation.jsonschema.minimum
import io.konform.validation.jsonschema.maximum

data class Model(val name: String, val age: Int)

val v = Validation<Model> {
    Model::name { minLength(3) }
    Model::age {
        minimum(0)
        maximum(120)
    }
}

val r = v.validate(Model("alice", 30))
val fields = r.errors.map { it.dataPath.removePrefix(".") }.distinct().map { it.lowercase() }.sorted()

println(if (fields.isEmpty()) "ok" else fields.joinToString("\n"))
