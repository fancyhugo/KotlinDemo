package com.hugo.kotlindemo.covariance

open class Animal
interface Pet
class PetShop<T>(val t: T) where  T : Animal?, T : Pet