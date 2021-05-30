package com.hugo.kotlindemo.base

fun main(args : Array<String>) {
    val n = Array<String>(3, init = {("John")})
    names(*n)
}

fun names(vararg  names : String){
    println("Argument length is ${names.size}")
    println("${names[0]}")
}