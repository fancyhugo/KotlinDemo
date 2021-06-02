package com.hugo.kotlindemo.coroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking<Unit> {
    // 将一个整数区间转化为流
    (1..3).asFlow().collect { value -> println(value) }
}