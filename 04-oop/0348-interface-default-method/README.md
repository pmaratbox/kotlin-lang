# 0348 — Interface Default Method

Define an interface with a default greet() returning "hi" and an implementer that overrides it to "hey", printing `hi hey`. Kotlin interfaces allow method bodies, so a default implementation needs no extra keyword.

## Run

    kotlinc InterfaceDefaultMethod.kt -include-runtime -d interfacedefaultmethod.jar && java -jar interfacedefaultmethod.jar
