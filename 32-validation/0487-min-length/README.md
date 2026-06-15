# 0487 — Minimum length

Uses the [Konform](https://github.com/konform-kt/konform) validation library and its `minLength` constraint to require `name` to be at least 3 characters long. Validating `{name:'al', age:30}` fails the constraint; the program prints the failing field name(s) (lowercased, sorted) pulled from the validator's error `dataPath`, or `ok` if validation passes.

## Run

    kotlin MinLength.main.kts
