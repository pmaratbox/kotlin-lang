@file:DependsOn("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1")
@file:DependsOn("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.8.1")

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

runBlocking {
    val out = mutableListOf<Int>()
    val left = flowOf(1, 2, 3)
    val right = flowOf(10, 20, 30)
    left.zip(right) { a, b -> a + b }.collect { out.add(it) }
    println(out.joinToString("\n"))
}
