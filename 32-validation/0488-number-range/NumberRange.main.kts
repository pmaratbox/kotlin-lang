@file:DependsOn("io.konform:konform-jvm:0.4.0")

import io.konform.validation.Validation
import io.konform.validation.jsonschema.minimum
import io.konform.validation.jsonschema.maximum

data class Person(val name: String, val age: Int)

val validate = Validation<Person> {
    Person::age {
        minimum(0)
        maximum(120)
    }
}

val result = validate.validate(Person(name = "alice", age = 200))
val fields = result.errors
    .map { it.dataPath.removePrefix(".") }
    .distinct()
    .sorted()

println(if (fields.isEmpty()) "ok" else fields.joinToString("\n").lowercase())
