# 0489 — Maximum length

Uses the [Konform](https://github.com/konform-kt/konform) validation library and its `maxLength` constraint to require `code` to be at most 5 characters long. Validating `{code:'ABCDEFG'}` fails the constraint; the program prints the failing field name(s) (lowercased, sorted) pulled from the validator's error `dataPath`, or `ok` if validation passes.

## Run

    kotlin MaxLength.main.kts
