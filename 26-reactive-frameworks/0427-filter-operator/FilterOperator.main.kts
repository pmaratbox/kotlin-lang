@file:DependsOn("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1")
@file:DependsOn("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.8.1")

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

runBlocking {
    val out = mutableListOf<Int>()
    (1..6).asFlow()
        .filter { it % 2 == 0 }
        .collect { out.add(it) }
    println(out.joinToString("\n"))
}
