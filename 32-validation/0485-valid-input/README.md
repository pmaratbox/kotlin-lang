# 0485 — Valid input

Validates an object with [Konform](https://github.com/konform-kt/konform), a
type-safe Kotlin validation DSL. The schema requires `name` to satisfy
`minLength(3)` and `age` to satisfy `minimum(0)` and `maximum(120)`. The input
`{name: alice, age: 30}` meets every constraint, so the validation result holds
no errors. The output is the sorted, lowercased failing field name(s) pulled
from the result's `errors` (`dataPath`), or `ok` when there are none — here, `ok`.

## Run

    kotlin ValidInput.main.kts
