# 0403 — Subscribe and Unsubscribe

Return a Subscription from subscribe() and use it to unsubscribe so later values are not delivered. The Subscription's `closed` flag is checked by both the producer loop and the observer before each `next`.

## Run

    kotlinc SubscribeUnsubscribe.kt -include-runtime -d subscribeunsubscribe.jar && java -jar subscribeunsubscribe.jar
