package com.hugo.kotlindemo.covariance.fruit

fun main(){
    val appleShop: Shop<out Fruit>
    val fruitShop: Shop<in Apple>
}