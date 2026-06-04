# 0195 — Defer LIFO Order

Register three deferred actions printing 1, 2, 3 and show they run in last-in-first-out order `3 2 1`. Kotlin has no `defer`, so an explicit stack (`ArrayDeque`) emulates the last-in-first-out semantics.

## Run

    kotlinc LifoOrder.kt -include-runtime -d lifoorder.jar && java -jar lifoorder.jar
