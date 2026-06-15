# 0492 — Custom rule

Uses the [Konform](https://github.com/konform-kt/konform) validation library with its `addConstraint` custom-rule feature to require that `password` contain at least one digit. Validating `{password:'abcdef'}` (no digit) fails the rule. The program prints the failing field name(s) (lowercased, deduped, sorted) pulled from each error's `dataPath`, or `ok` if validation passes.

## Run

    kotlin CustomRule.main.kts
