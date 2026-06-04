# 0351 — Instance Counter

Track how many instances of a class have been created; after building three, print `3`. Kotlin keeps the shared counter in a companion object, bumped from each instance's init block.

## Run

    kotlinc InstanceCounter.kt -include-runtime -d instancecounter.jar && java -jar instancecounter.jar
