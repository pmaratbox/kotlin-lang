# 0106 — Producer / Consumer

A producer sends 1..5 to a consumer that sums them, printing `15`. Kotlin uses a bounded `ArrayBlockingQueue` plus a poison-pill sentinel so the consumer knows when to stop.

## Run

    kotlinc Consumer.kt -include-runtime -d consumer.jar && java -jar consumer.jar
