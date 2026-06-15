# 0508 — List field

Uses the **graphql-java** library to build a schema in-process. The `Query.numbers: [Int]` field is a list field; its data fetcher returns `listOf(1, 2, 3)`. The query `{ numbers }` is executed in-process and each element of `data.numbers` is printed on its own line.

## Run

    kotlin ListField.main.kts
