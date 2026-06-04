# 0271 — DFA String Match

Build a DFA for the pattern "ab" and report the first match index in "aab", printing `1`. The DFA state advances per character and rewinds on a partial restart in Kotlin.

## Run

    kotlinc StringMatchDfa.kt -include-runtime -d stringmatchdfa.jar && java -jar stringmatchdfa.jar
