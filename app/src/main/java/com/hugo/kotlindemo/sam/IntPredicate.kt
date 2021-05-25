package com.hugo.kotlindemo.sam

 interface IntPredicate {
    fun accept(i: Int): Boolean
}
// 创建一个类的实例
val isEven = object : IntPredicate {
    override fun accept(i: Int): Boolean {
        return i % 2 == 0
    }
}