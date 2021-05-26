package com.hugo.kotlindemo.covariance;

class GreenApple extends Apple {
    @Override
    public String returnMeat() {
        return "green apple meat";
    }
}