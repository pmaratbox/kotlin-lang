# 0416 — Subject Multicast

Implement a Subject that multicasts each emission to all current observers; two observers both receive 1 then 2. A generic `Subject<T>` holds a list of observer lambdas and fans each `next` out to them in registration order.

## Run

    kotlinc SubjectMulticast.kt -include-runtime -d subjectmulticast.jar && java -jar subjectmulticast.jar
