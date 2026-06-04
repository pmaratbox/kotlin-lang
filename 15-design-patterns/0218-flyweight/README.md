# 0218 — Flyweight

Share flyweight instances for repeated characters a, b, a and print the number of distinct objects created `2`. A companion `object` factory uses `getOrPut` to cache one instance per character key.

## Run

    kotlinc Flyweight.kt -include-runtime -d flyweight.jar && java -jar flyweight.jar
