# 0486 — Required field

This lesson uses the [Konform](https://github.com/konform-kt/konform) validation
library. The schema requires both `name` and `age`; each property carries a
custom `addConstraint` that fails when the value is absent (`null`). The input
supplies `name` but omits `age`, so validation fails. The output is the failing
field name(s) — lowercased, de-duplicated, and sorted — extracted from each
error's `dataPath`, or `ok` when validation passes. Library-specific message
text is never printed.

## Run

    kotlin RequiredField.main.kts
