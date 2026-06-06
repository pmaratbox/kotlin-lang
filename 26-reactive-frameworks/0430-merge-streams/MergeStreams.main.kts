@file:DependsOn("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1")
@file:DependsOn("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.8.1")

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.test.runTest

@OptIn(kotlinx.coroutines.ExperimentalCoroutinesApi::class)
fun run() = runTest {
    val out = mutableListOf<Int>()
    val a = flow { delay(10); emit(1); delay(20); emit(3); delay(20); emit(5) }
    val b = flow { delay(20); emit(2); delay(20); emit(4); delay(20); emit(6) }
    merge(a, b).collect { out.add(it) }
    println(out.joinToString("\n"))
}
run()
