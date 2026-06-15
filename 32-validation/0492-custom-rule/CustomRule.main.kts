@file:DependsOn("io.konform:konform-jvm:0.4.0")

import io.konform.validation.Validation

data class Credentials(val password: String)

val validate = Validation<Credentials> {
    Credentials::password {
        addConstraint("must contain at least one digit") { value ->
            value.any { it.isDigit() }
        }
    }
}

val result = validate.validate(Credentials(password = "abcdef"))
val fields = result.errors
    .map { it.dataPath.removePrefix(".") }
    .distinct()
    .sorted()

println(if (fields.isEmpty()) "ok" else fields.joinToString("\n").lowercase())
