# 0149 — Encapsulation

Keep an account balance private, deposit 50 onto an initial 100 through a method, and print `150`. Kotlin's `private var` hides the field while a `deposit()` method and a getter expose only intended behavior.

## Run

    kotlinc Encapsulation.kt -include-runtime -d encapsulation.jar && java -jar encapsulation.jar
