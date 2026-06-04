# 0284 — Trie Autocomplete

Insert "car","card","dog" into a trie and autocomplete the prefix "car", printing `car card`. A `sortedMapOf` for children yields lexicographic DFS order for free.

## Run

    kotlinc TrieAutocomplete.kt -include-runtime -d trieautocomplete.jar && java -jar trieautocomplete.jar
