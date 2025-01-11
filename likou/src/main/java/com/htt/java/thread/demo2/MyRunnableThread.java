package com.htt.java.thread.demo2;

public class MyRunnableThread implements Runnable {
    private final String val = "我是任务";

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" 666666");
        /*try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
    }
}
