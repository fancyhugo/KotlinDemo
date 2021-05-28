package com.hugo.kotlindemo.enum

enum class RGB { RED, GREEN, BLUE }

inline fun <reified T : Enum<T>> printAllValues() {
    print(enumValues<T>().joinToString { it.name })
}

fun main() {
    printAllValues<RGB>() // 输出 RED, GREEN, BLUE
}