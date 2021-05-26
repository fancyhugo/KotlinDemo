package com.hugo.kotlindemo.covariance;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String args[]) {
        eatFruitMeat(new Fruit());//输出eat generic fruit meat
        eatFruitMeat(new Apple());//输出eat apple meat
        eatFruitMeat(new GreenApple());//输出eat green apple meat
        List<GreenApple> greenApples = new ArrayList<>();
        greenApples.add(new GreenApple());
        List<Fruit> fruits =  new ArrayList<>();
        fruits.add(new Fruit());
        List<Apple> apples =  new ArrayList<>();
        fruits.add(new Apple());
        eatFruitMeats(greenApples);
        //eatFruitMeats(fruits);//编译错误1
        eatFruitMeats(apples);
    }

    public static void eatFruitMeat(Fruit fruit) {
        System.out.println("eat " + fruit.returnMeat());
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void eatFruitMeats(List<? extends Apple> fruits) {
        fruits.forEach(fruit->System.out.println("eat "+fruit.returnMeat()));
       // fruits.add(new Apple());//编译错误2
       // fruits.add(new Fruit());//编译错误3
       // fruits.add(new Object());//编译错误4
    }
}
