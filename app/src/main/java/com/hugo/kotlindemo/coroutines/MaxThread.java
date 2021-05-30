package com.hugo.kotlindemo.coroutines;

public class MaxThread {
    public static void main(String args[]){
        for(int i = 0;i<100_000;i++){
           Thread thread=  new Thread(new Runnable() {
                @Override
                public void run() {
                  System.out.print(".");
                }
            });
            thread.run();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

    }
}
