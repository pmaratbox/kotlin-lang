# 0279 — Minimum Window Substring

Find the smallest window in "ADOBECODEBANC" containing all of "ABC", printing `BANC`. A `HashMap<Char, Int>` tracks the sliding-window deficit.

## Run

    kotlinc MinWindowSubstring.kt -include-runtime -d minwindowsubstring.jar && java -jar minwindowsubstring.jar
