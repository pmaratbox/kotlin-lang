@file:DependsOn("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1")
@file:DependsOn("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.8.1")

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.test.runTest

@OptIn(kotlinx.coroutines.ExperimentalCoroutinesApi::class)
fun run() = runTest {
    val out = mutableListOf<String>()
    val a = flow { delay(10); emit(1); delay(20); emit(2) }
    val b = flow { delay(20); emit(10) }
    a.combine(b) { x, y -> "($x, $y)" }.collect { out.add(it) }
    println(out.joinToString("\n"))
}
run()
