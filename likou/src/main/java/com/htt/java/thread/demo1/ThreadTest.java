package com.htt.java.thread.demo1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
/*        //1 继承 Thread的run()
        MyThread myThread = new MyThread();
        myThread.start();
        //2 实现 Runnable 的 run()
        Runnable t2 = new MyThread2();
        new Thread(t2).start();
*/
        //3 实现 Callable接口的call() , 可以获取到多线程的返回值
        Callable<Integer> t4 = new MyThread4();
        FutureTask<Integer> fut = new FutureTask<>(t4);  // 未来任务对象
        new Thread(fut).start();
        Integer res = fut.get();
        System.out.println(res);

        for (int i = 0; i < 100; i++) {
            System.out.println("主线程 + " + i);
        }
    }
}
