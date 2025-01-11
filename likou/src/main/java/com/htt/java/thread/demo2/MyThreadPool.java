package com.htt.java.thread.demo2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// 使用线程池处理Runnable任务
public class MyThreadPool {
    public static void main(String[] args) {
        // 创建线程池对象
        ThreadPoolExecutor pool = new ThreadPoolExecutor(3, 5, // 核心线程和最大线程
                3, TimeUnit.SECONDS,                    // 临时线程存活时间
                new ArrayBlockingQueue<>(4),    // 创建任务队列
                Executors.defaultThreadFactory(),       // 线程工厂，创建线程的具体位置
                new ThreadPoolExecutor.AbortPolicy());// 当线程都在工作且任务仍存在时，处理不过来该怎么办？这个类中处理这种情况
        MyRunnableThread task = new MyRunnableThread();
        pool.execute(task);
        pool.execute(task);
        pool.execute(task);
        pool.execute(task);
        pool.execute(task);

        pool.execute(task);
        pool.execute(task);

    }
}
