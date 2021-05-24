package com.hugo.kotlindemo.demo

fun main() {
    fun printDouble(d: Double) { print(d) }

    val i = 1
    val d = 1.1
    val f = 1.1f

    printDouble(d)
 //   printDouble(i) // 错误：类型不匹配
//    printDouble(f) // 错误：类型不匹配
}