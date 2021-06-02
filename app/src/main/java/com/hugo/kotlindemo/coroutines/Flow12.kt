package com.hugo.kotlindemo.coroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun log12(msg: String) = println("[${Thread.currentThread().name}] $msg")

fun simple12(): Flow<Int> = flow {
    log12("Started simple flow")
    for (i in 1..3) {
        emit(i)
    }
}

fun main() = runBlocking<Unit> {
    simple12().collect { value -> log12("Collected $value") }
}