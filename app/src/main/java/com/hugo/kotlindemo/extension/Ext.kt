package com.hugo.kotlindemo.extension

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // “this”对应该列表
    this[index1] = this[index2]
    this[index2] = tmp
}

fun main() {
    val list = mutableListOf(1, 2, 3)
    list.swap(0, 2) // “swap()”内部的“this”会保存“list”的值
    list.forEach { println(it) }
}