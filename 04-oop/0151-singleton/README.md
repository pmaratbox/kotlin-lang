# 0151 — Singleton

Obtain a singleton instance twice and confirm both references are the same object, printing `same: yes`. Kotlin's `object` declaration is a built-in singleton, so the referential `===` check always holds.

## Run

    kotlinc Singleton.kt -include-runtime -d singleton.jar && java -jar singleton.jar
