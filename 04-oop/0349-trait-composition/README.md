# 0349 — Trait Composition

Compose two capabilities (A printing "a", B printing "b") into one type and invoke both, printing `a b`. Kotlin mixes multiple interfaces into one class, inheriting each default method.

## Run

    kotlinc TraitComposition.kt -include-runtime -d traitcomposition.jar && java -jar traitcomposition.jar
