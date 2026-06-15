@file:DependsOn("io.konform:konform-jvm:0.4.0")

import io.konform.validation.Validation

// Schema requires `name` and `age`. We model the input as a map where a
// missing field is simply absent. Konform's custom `addConstraint` flags any
// required key that is not present, reporting ALL failures (not fail-fast).
data class Input(val name: String?, val age: Int?)

val v = Validation<Input> {
    Input::name {
        addConstraint("required") { it != null }
    }
    Input::age {
        addConstraint("required") { it != null }
    }
}

// `name` present, `age` MISSING.
val r = v.validate(Input(name = "ada", age = null))

val fields = r.errors
    .map { it.dataPath.removePrefix(".") }
    .map { it.lowercase() }
    .distinct()
    .sorted()

println(if (fields.isEmpty()) "ok" else fields.joinToString("\n"))
