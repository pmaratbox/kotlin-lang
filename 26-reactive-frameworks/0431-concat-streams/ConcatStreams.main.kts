@file:DependsOn("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1")
@file:DependsOn("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.8.1")

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

@OptIn(FlowPreview::class)
fun run() = runBlocking {
    val first = flowOf(1, 2)
    val second = flowOf(3, 4)
    val out = mutableListOf<Int>()
    flowOf(first, second).flattenConcat().collect { out.add(it) }
    println(out.joinToString("\n"))
}
run()
