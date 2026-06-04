# 0373 — Exception Hierarchy

Throw a specific error subtype and catch it through a base-type handler, printing `caught base`. Kotlin's `catch` matches a subtype against a handler typed for its supertype.

## Run

    kotlinc ExceptionHierarchy.kt -include-runtime -d exceptionhierarchy.jar && java -jar exceptionhierarchy.jar
