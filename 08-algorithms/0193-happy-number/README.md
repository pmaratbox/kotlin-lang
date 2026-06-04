# 0193 — Happy Number

Determine whether 19 is a happy number and print `yes`. Repeatedly sum squares of digits; 19->1 so yes (detect cycles with a `MutableSet`).

## Run

    kotlinc Number.kt -include-runtime -d number.jar && java -jar number.jar
