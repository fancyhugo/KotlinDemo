package com.hugo.kotlindemo.coroutines

import kotlinx.coroutines.*

suspend fun simple1(): List<Int> {
    delay(1000) // 假装我们在这里做了一些异步的事情
    return listOf(1, 2, 3)
}

fun main() = runBlocking<Unit> {
    simple1().forEach { value -> println(value) }
    println("when is done")
}