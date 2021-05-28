package com.hugo.kotlindemo.covariance.fruit;

interface Shop<T> {
    void showFruitName(T t);
    T getFruit();
}