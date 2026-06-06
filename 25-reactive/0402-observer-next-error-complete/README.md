# 0402 — Observer Contract

Demonstrate the observer contract next*-then-terminal: emit 1 and 2, complete, and show that a post-complete next is ignored. A private `stopped` flag, flipped on the first terminal, makes subsequent `next`/terminal calls no-ops.

## Run

    kotlinc ObserverNextErrorComplete.kt -include-runtime -d observernexterrorcomplete.jar && java -jar observernexterrorcomplete.jar
