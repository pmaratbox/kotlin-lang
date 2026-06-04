# 0200 — Precondition Assert

Check a precondition arg>0: for 5 print `ok`, and for -1 report the failure `error: must be positive`, on two lines. Kotlin's `require` throws `IllegalArgumentException` with a lazily built message when the precondition fails.

## Run

    kotlinc Assert.kt -include-runtime -d assert.jar && java -jar assert.jar
