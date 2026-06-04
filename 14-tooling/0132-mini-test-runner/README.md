# 0132 — Mini Test Runner

Run three named test functions that all pass and report `3 passed, 0 failed`. Each test is a closure run inside a `try`/`catch` that tallies passes and failures.

## Run

    kotlinc TestRunner.kt -include-runtime -d testrunner.jar && java -jar testrunner.jar
