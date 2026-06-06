@file:DependsOn("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1")
@file:DependsOn("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.8.1")

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

runBlocking {
    val out = mutableListOf<Int>()
    flowOf(1, 2, 3, 4)
        .scan(0) { acc, x -> acc + x }
        .drop(1)
        .collect { out.add(it) }
    println(out.joinToString("\n"))
}
