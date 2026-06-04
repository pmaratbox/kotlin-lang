# 0263 — Traffic Light FSM

Starting at red, advance a traffic light through four transitions (red->green->yellow->red->green), printing each new state `green yellow red green`. A `mapOf` transition table drives the state in Kotlin.

## Run

    kotlinc TrafficLight.kt -include-runtime -d trafficlight.jar && java -jar trafficlight.jar
