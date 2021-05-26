package com.hugo.kotlindemo.demo;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    public static void main(String args[]){
        // Java
        List<String> strs = new ArrayList<String>();
        /*List<Object> objs = strs; // ！！！此处的编译器错误让我们避免了之后的运行时异常
        objs.add(1); // 这里我们把一个整数放入一个字符串列表
        String s = strs.get(0); // ！！！ ClassCastException：无法将整数转换为字符串*/
    }

    void demo(List<String> strs) {
       /// List<Object> objects = strs; // ！！！在 Java 中不允许
        // ……
    }
}
