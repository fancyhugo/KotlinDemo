package com.hugo.kotlindemo.delegation.property

import kotlin.properties.Delegates

class User {
    var name: String by Delegates.observable("<no name>") {
            prop, old, new ->
        println("$old -> $new")
    }

    var lastName :String by Delegates.observable("init no value"){
        property, oldValue, newValue ->
        println("$property:$oldValue -> $newValue")
    }

    var age :Int by Delegates.observable(0){
        property, oldValue, newValue ->
        println("$property:$oldValue -> $newValue")

    }
}

fun main() {
    val user = User()
    user.lastName = "first"
    user.age = 10
    user.name = "third"
}