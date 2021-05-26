package com.hugo.kotlindemo.data

data class User(val name: String, val age: Int)

fun main() {
    var user = User("hugo", 35)
    var user2 = user.copy("hugo", 35)
    println(user2.name)
    val jane = User("Jane", 35)
    val (name, age) = jane
    println("$name, $age years of age")
    val jack = User(name = "Jack", age = 1)
    println("${jack.name}, ${jack.age} years of age")
    val olderJack = jack.copy(age = 2)
    println("${olderJack.name}, ${olderJack.age} years of age")
    println(olderJack.component1())
}