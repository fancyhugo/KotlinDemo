package com.hugo.kotlindemo.covariance

//fun copy(from: Array<Any>, to: Array<Any>) {
fun copy(from: Array<out Any>, to: Array<Any>) {
    assert(from.size == to.size)
    for (i in from.indices)
        to[i] = from[i]
}

fun main(){
    val ints: Array<Int> = arrayOf(1, 2, 3)
    val any = Array<Any>(3) { "" }
    copy(ints, any)
//   ^ type is Array<Int> but Array<Any> was expected

}