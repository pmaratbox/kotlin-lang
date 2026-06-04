# 0272 — Glob Star Match

Match the glob "a*b" (* = any run) against "aaab" (yes) and "aac" (no), printing `yes no`. A backtracking matcher remembers the last `*` position to retry in Kotlin.

## Run

    kotlinc GlobStarMatch.kt -include-runtime -d globstarmatch.jar && java -jar globstarmatch.jar
