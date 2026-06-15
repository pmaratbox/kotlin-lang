# 0472 — Default value

Define an integer option `--count` with a default value of `1` using the real `clikt` library and its `.int().default(1)` builders. The parser is given a hardcoded empty argv `arrayOf()` for determinism, so `--count` is absent and clikt supplies its default, printing `1`.

## Run

    kotlin DefaultValue.main.kts
