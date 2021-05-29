package com.hugo.kotlindemo.infix

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main(args: Array<String>) {
   /* val map = mapOf(1 to "A", 2 to "B", 3 to "C")//to实际上一个返回Pair对象的函数，不是属于map结构内部的运算符，但是to在语法层面使用很像中缀运算符调用
    map.forEach { key, value ->
        println("key: $key   value:$value")
    }*/

    val oddNum:  (Int) -> Unit = {
        if (it % 2 == 1) {
            println(it)
        } else {
            println("is not a odd num")
        }
    }

    val evenNum:  (Int) -> Unit = {
        if (it % 2 == 0) {
            println(it)
        } else {
            println("is not a even num")
        }
    }

    oddNum.invoke(100)
    evenNum.invoke(100)

}
