package com.hugo.kotlindemo.delegation

import kotlin.properties.Delegates

class Person{
    var address: String by Delegates.vetoable(initialValue = "NanJing", onChange = {property, oldValue, newValue ->
        println("property: ${property.name}  oldValue: $oldValue  newValue: $newValue")
        return@vetoable newValue == "BeiJing"
    })
}

fun main(args: Array<String>) {
    val person = Person().apply { address = "NanJing" }
    person.address = "BeiJing"
    person.address = "ShangHai"
    person.address = "GuangZhou"
    println("address is ${person.address}")
}
