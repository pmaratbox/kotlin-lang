@file:DependsOn("io.konform:konform-jvm:0.4.0")

import io.konform.validation.Validation
import io.konform.validation.jsonschema.maxLength

data class Model(val code: String)

val v = Validation<Model> {
    Model::code { maxLength(5) }
}

val r = v.validate(Model("ABCDEFG"))
val fields = r.errors
    .map { it.dataPath.removePrefix(".").lowercase() }
    .distinct()
    .sorted()

println(if (fields.isEmpty()) "ok" else fields.joinToString("\n"))
