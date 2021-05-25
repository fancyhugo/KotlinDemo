package com.hugo.kotlindemo.extension

class Rectangle: Shape()
fun Shape.getName() = "Shape"

fun Rectangle.getName() = "Rectangle"

fun printClassName(s: Shape) {
    println(s.getName())
}

fun Any?.toString(): String {
    if (this == null) return "null"
    // 空检测之后，“this”会自动转换为非空类型，所以下面的 toString()
    // 解析为 Any 类的成员函数
    return toString()
}
val Rectangle.number: Int
    get() = 1

fun main(){
    printClassName(Rectangle())

}