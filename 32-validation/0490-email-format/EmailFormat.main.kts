@file:DependsOn("io.konform:konform-jvm:0.4.0")

import io.konform.validation.Validation
import io.konform.validation.jsonschema.pattern

data class Model(val email: String)

val v = Validation<Model> {
    Model::email {
        pattern("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")
    }
}

val r = v.validate(Model("not-an-email"))
val fields = r.errors.map { it.dataPath.removePrefix(".") }.distinct().sorted()
println(if (fields.isEmpty()) "ok" else fields.joinToString("\n"))
