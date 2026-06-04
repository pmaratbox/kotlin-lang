# 0220 — Null Object

Compare a no-op null logger with a real logger; only the real one records, so print the logged count `1`. A singleton `object` implements the logger interface with an empty body as the null object.

## Run

    kotlinc NullObject.kt -include-runtime -d nullobject.jar && java -jar nullobject.jar
