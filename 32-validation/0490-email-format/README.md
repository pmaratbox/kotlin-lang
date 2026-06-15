# 0490 — Email format

Uses the [konform](https://github.com/konform-kt/konform) validation library. The `email` field is checked with konform's `pattern` constraint against an email regex (`^[^@\s]+@[^@\s]+\.[^@\s]+$`), since konform has no dedicated email validator. The program runs the validator on `{email: "not-an-email"}` and prints the failing field name(s) extracted from the error result (`dataPath`), lowercased and sorted, or `ok` if validation passes.

## Run

    kotlin EmailFormat.main.kts
