# 0488 — Number range

Uses the [konform](https://github.com/konform-kt/konform) validation library. The `age` field is constrained with `minimum(0)` and `maximum(120)`; validating `{name:"alice", age:200}` fails the upper bound. The program prints the sorted, lowercased failing field name(s) taken from the validator's error `dataPath` (or `ok` if validation passes), never the library's message text.

## Run

    kotlin NumberRange.main.kts
