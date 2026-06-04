# 0293 — Longest Palindromic Subsequence

Compute the longest palindromic subsequence length of "bbbab", printing `4`. Filling the 2D table over widening substrings is direct with Kotlin's `Array(n) { IntArray(n) }`.

## Run

    kotlinc LongestPalindromicSubseq.kt -include-runtime -d longestpalindromicsubseq.jar && java -jar longestpalindromicsubseq.jar
