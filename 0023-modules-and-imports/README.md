# 0023 — Modules & Imports

Define `square(n)` in a separate `mathutil` module and import it from the main program, printing `square(8) = 64` across the module boundary. `Mathutil.kt` declares `package mathutil` with a top-level `square` function, and `Main.kt` brings it into scope with `import mathutil.square`. Unlike Java, Kotlin allows functions at the top level (no enclosing class), and a file's package need not match its directory.

## Run

    kotlinc Main.kt Mathutil.kt -include-runtime -d modules.jar && java -jar modules.jar
