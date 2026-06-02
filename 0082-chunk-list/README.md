# 0082 — Chunk a List

Split the list `1, 2, 3, 4, 5, 6, 7` into chunks of `3` and print each chunk on its own line: `1 2 3`, `4 5 6`, `7`. `chunked(3)` splits the list into sublists of up to three elements.

## Run

    kotlinc ChunkList.kt -include-runtime -d chunk.jar && java -jar chunk.jar
