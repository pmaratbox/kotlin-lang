# 0491 — Multiple errors

Uses the [Konform](https://github.com/konform-kt/konform) validation library with its `minLength` and `minimum`/`maximum` constraints to require `name` to be at least 3 characters and `age` in `0..120`. Konform always collects every failing constraint (it does not fail-fast), so validating `{name:'al', age:200}` reports both errors. The program prints the failing field name(s) (lowercased, deduped, sorted) pulled from each error's `dataPath`, or `ok` if validation passes.

## Run

    kotlin MultipleErrors.main.kts
