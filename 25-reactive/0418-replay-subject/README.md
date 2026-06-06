# 0418 — ReplaySubject

Implement a ReplaySubject with a buffer of the last 2 values, replayed to a late subscriber, which then also receives new values. An `ArrayDeque` bounded to the buffer size replays cached values to each new subscriber before adding it to the observer list.

## Run

    kotlinc ReplaySubject.kt -include-runtime -d replaysubject.jar && java -jar replaysubject.jar
