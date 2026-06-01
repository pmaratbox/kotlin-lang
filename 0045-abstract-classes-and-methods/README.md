# 0045 — Abstract Classes & Methods

Define an abstract `Shape` with an abstract `area` and a concrete `describe` that uses it, then implement a `Square` of side 3 and print `area: 9`. An `abstract class` with an `abstract fun` cannot be instantiated and requires `Square` to `override area`, while the concrete `describe` is inherited. Abstract members are implicitly open.

## Run

    kotlinc AbstractClasses.kt -include-runtime -d shapes.jar && java -jar shapes.jar
