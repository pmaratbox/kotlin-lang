# 0028 — String Formatting

Format the float `3.14159` to two decimals and zero-pad the integer `42` to width five, printing `pi: 3.14` and `id: 00042`. Kotlin calls through to Java's formatter via the `String.format` extension: `"%.2f".format(Locale.US, pi)` fixes two decimals (with an explicit locale for the dot) and `"%05d".format(42)` zero-pads to width 5.

## Run

    kotlinc Formatting.kt -include-runtime -d formatting.jar && java -jar formatting.jar
