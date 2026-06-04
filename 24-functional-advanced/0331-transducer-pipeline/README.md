# 0331 — Transducer Pipeline

Compose map(+1) with filter(even) and run it over [1,2,3,4], printing `2 4`. Transducers wrap a reducing step so the whole pipeline runs in a single fold.

## Run

    kotlinc TransducerPipeline.kt -include-runtime -d transducerpipeline.jar && java -jar transducerpipeline.jar
