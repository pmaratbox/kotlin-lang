# 0057 — Sieve of Eratosthenes

Use the Sieve of Eratosthenes to find every prime number up to `10` and print them: `2 3 5 7`. `BooleanArray(n + 1) { true }` seeds the flags with a lambda initializer; multiples are struck from `i*i`, and `(2..n).filter` collects the primes.

## Run

    kotlinc Sieve.kt -include-runtime -d sieve.jar && java -jar sieve.jar
