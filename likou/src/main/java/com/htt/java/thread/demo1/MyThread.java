package com.htt.java.thread.demo1;

import java.util.concurrent.Callable;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("MyThread + " + i);
        }
    }
}

class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("MyThread222 + " + i);
        }
    }
}

class MyThread3{
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("匿名内部类 + " + i);
                }
            }
        };
        /*Runnable r2 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("匿名内部类 + " + i);
            }
        };*/

        new Thread(r).start();
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程 + " + i);
        }
    }
}

class MyThread4 implements Callable<Integer> {
    private int n = 0;

    public MyThread4() {
    }

    public MyThread4(int n) {
        this.n = n;
    }

    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < 100; i++) {
            n += i;
        }
        return n;
    }
}