# 0229 — Parse INI

Parse the INI text with section [s] and key k=v, printing the flattened entry `s.k=v`. Iterating `lines()` tracks the current section and emits `section.key=value`.

## Run

    kotlinc IniParse.kt -include-runtime -d iniparse.jar && java -jar iniparse.jar
