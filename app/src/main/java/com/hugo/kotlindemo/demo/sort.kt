package com.hugo.kotlindemo.demo

fun <T : Comparable<T>> sort(list: List<T>) { }

fun <T> copyWhenGreater(list: List<T>, threshold: T): List<String>
        where T : CharSequence,
              T : Comparable<T> {
    return list.filter { it > threshold }.map { it.toString() }
}


fun main(){
    sort(listOf(1, 2, 3)) // OK. Int is a subtype of Comparable<Int>
    sort(listOf(HashMap<Int, String>())) // Error: HashMap<Int, String> is not a subtype of Comparable<HashMap<Int, String>>

}