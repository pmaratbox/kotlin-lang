# 0222 — Bracket Matching

Check that mixed brackets are balanced: "([{}])" (yes) and "([)]" (no), printing `yes no`. An `ArrayDeque` used as a stack pushes opens and matches closes via a pair map.

## Run

    kotlinc BracketMatching.kt -include-runtime -d bracketmatching.jar && java -jar bracketmatching.jar
