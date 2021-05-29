package com.hugo.kotlindemo.funTest

fun main() {
    var mood = "I am sad"

    run {
        val mood = "I am happy"
        println(mood) // I am happy
    }
    println(mood)  // I am sad


  test("Hello World")

}


fun test(stringVariable :String){
    stringVariable?.run {
        println("The length of this String is $length")
    }
// Similarly.
    stringVariable?.let {
        println("The length of this String is ${it.length}")
    }
}

fun long(){
    val original = "abc"
// Evolve the value and send to the next chain
    original.let {
        println("The original String is $it") // "abc"
        it.reversed() // evolve it as parameter to send to next let
    }.let {
        println("The reverse String is $it") // "cba"
        it.length  // can be evolve to other type
    }.let {
        println("The length of the String is $it") // 3
    }
// Wrong
// Same value is sent in the chain (printed answer is wrong)
    original.also {
        println("The original String is $it") // "abc"
        it.reversed() // even if we evolve it, it is useless
    }.also {
        println("The reverse String is ${it}") // "abc"
        it.length  // even if we evolve it, it is useless
    }.also {
        println("The length of the String is ${it}") // "abc"
    }
// Corrected for also (i.e. manipulate as original string
// Same value is sent in the chain
    original.also {
        println("The original String is $it") // "abc"
    }.also {
        println("The reverse String is ${it.reversed()}") // "cba"
    }.also {
        println("The length of the String is ${it.length}") // 3
    }

}

