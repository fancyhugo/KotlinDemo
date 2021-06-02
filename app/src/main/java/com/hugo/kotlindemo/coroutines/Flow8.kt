package com.hugo.kotlindemo.coroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

suspend fun performRequest8(request: Int): String {
    delay(1000) // 模仿长时间运行的异步任务
    return "response $request"
}

fun main() = runBlocking<Unit> {
    (1..3).asFlow() // 一个请求流
        .transform { request ->
            emit("Making request $request")
            emit(performRequest8(request))
        }
        .collect { response -> println(response) }
}