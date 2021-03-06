package com.hugo.kotlindemo.coroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*


fun simple5(): Flow<Int> = flow {
    for (i in 1..3) {
        delay(100)
        println("Emitting $i")
        emit(i)
    }
}

fun main() = runBlocking<Unit> {
    withTimeoutOrNull(250) { // 在 250 毫秒后超时
        simple5().collect { value -> println(value) }
    }
    println("Done")
}