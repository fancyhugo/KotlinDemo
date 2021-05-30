package com.hugo.kotlindemo.coroutines

import kotlinx.coroutines.*

fun main() = runBlocking {
    withTimeout(1300L) {
        repeat(1000) { i ->
            println("I'm sleeping $i ...")
            delay(500L)
        }
    }
}