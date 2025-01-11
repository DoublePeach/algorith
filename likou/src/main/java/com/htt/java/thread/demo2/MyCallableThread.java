package com.htt.java.thread.demo2;

import java.util.concurrent.Callable;

class MyCallableThread implements Callable<String> {
    private int n = 0;

    public MyCallableThread() {
    }

    public MyCallableThread(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            n += i;
        }
        return Thread.currentThread().getName() +"线程处理的结果是 + " + n;
    }
}