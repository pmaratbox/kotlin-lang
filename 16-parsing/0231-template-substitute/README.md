# 0231 — Template Substitution

Substitute the variable in the template "hi {name}" with name="Ada", printing `hi Ada`. A `Regex.replace` with a lambda looks each `{key}` up in the map.

## Run

    kotlinc TemplateSubstitute.kt -include-runtime -d templatesubstitute.jar && java -jar templatesubstitute.jar
