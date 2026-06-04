# 0173 — Trie

Insert "cat" and "car" into a trie, then search "car" (yes) and "can" (no), printing `yes no`. Each node carries a `HashMap<Char, Node>` of children plus an `end` flag, built up with `getOrPut`.

## Run

    kotlinc Trie.kt -include-runtime -d trie.jar && java -jar trie.jar
