package com.hugo.kotlindemo.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main(){
    val job = GlobalScope.launch { // 启动一个新协程并保持对这个作业的引用
        delay(1000L)
        println("World!")
    }
    println("Hello,")
    job.join() // 等待直到子协程执行结束
}