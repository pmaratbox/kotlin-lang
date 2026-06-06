@file:DependsOn("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1")
@file:DependsOn("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.8.1")

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun run() = runBlocking {
    val naturals = flow {
        var n = 1
        while (true) {
            emit(n)
            n++
        }
    }

    naturals
        .take(3)
        .onCompletion { println("completed") }
        .collect { println(it) }
}

run()
