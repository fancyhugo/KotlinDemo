package com.hugo.kotlindemo.demo

fun main() {
    val text = """
    for (c in "foo")
        print(c)
"""
    println(text)

    val text2 = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()
    println(text2)

    val price = """
${'$'}9.99
"""
    println(price)
}