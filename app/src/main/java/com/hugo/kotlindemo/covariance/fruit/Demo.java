package com.hugo.kotlindemo.covariance.fruit;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String args[]) {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple());
        float totalWeight = getTotalWeight(apples);
    }

    // 👆 不再报错
    // 👇 增加了上界通配符 ? extends
    private static float getTotalWeight(List<? extends Fruit> fruitList) {
        //fruitList.add(new Apple());
        float totalWeight = 0;
        for (Fruit fruit : fruitList) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    private static void test(){
        Shop<? super Apple> apples = new Shop<Fruit>(){
            @Override
            public void showFruitName(Fruit apple) { }

            @Override
            public Fruit getFruit() {
                return null;
            }
        };
        apples.showFruitName(new Apple());
        Apple apple = (Apple) apples.getFruit();
    }
}
