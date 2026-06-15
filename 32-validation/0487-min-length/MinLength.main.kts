@file:DependsOn("io.konform:konform-jvm:0.4.0")

import io.konform.validation.Validation
import io.konform.validation.jsonschema.minLength

data class Model(val name: String, val age: Int)

val v = Validation<Model> {
    Model::name { minLength(3) }
}

val r = v.validate(Model("al", 30))
val fields = r.errors
    .map { it.dataPath.removePrefix(".").lowercase() }
    .distinct()
    .sorted()

println(if (fields.isEmpty()) "ok" else fields.joinToString("\n"))
