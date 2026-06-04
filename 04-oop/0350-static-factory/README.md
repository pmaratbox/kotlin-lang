# 0350 — Static Factory Method

Use a static factory Color.fromHex("#ff0000") to build a color and print its components `255 0 0`. Kotlin exposes class-level factories through a companion object with a private constructor.

## Run

    kotlinc StaticFactory.kt -include-runtime -d staticfactory.jar && java -jar staticfactory.jar
