package com.hugo.kotlindemo.covariance;

class Apple extends Fruit {
    @Override
    public String returnMeat() {
        return "apple meat";
    }
}