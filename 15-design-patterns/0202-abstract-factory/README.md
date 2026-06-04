# 0202 — Abstract Factory

Use a "dark" theme abstract factory to build a button and a checkbox, printing `dark-button dark-checkbox`. The factory interface returns themed Kotlin objects whose labels carry the prefix.

## Run

    kotlinc AbstractFactory.kt -include-runtime -d abstractfactory.jar && java -jar abstractfactory.jar
