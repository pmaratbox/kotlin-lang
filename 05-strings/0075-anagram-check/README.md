# 0075 — Anagram Check

Check whether each pair is an anagram by comparing sorted letters — `listen`/`silent` and `hello`/`world` — printing `listen/silent: yes` and `hello/world: no`. `toCharArray().sorted()` returns a sorted `List<Char>`; equal lists mean the words are anagrams.

## Run

    kotlinc Anagram.kt -include-runtime -d anagram.jar && java -jar anagram.jar
