package com.htt.java.thread.demo2;

import java.util.concurrent.*;

// 使用线程池处理Callable任务
public class MyThreadPool2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建线程池对象
        ThreadPoolExecutor pool = new ThreadPoolExecutor(3, 5, // 核心线程和最大线程
                3, TimeUnit.SECONDS,                    // 临时线程存活时间
                new ArrayBlockingQueue<>(4),    // 创建任务队列
                Executors.defaultThreadFactory(),       // 线程工厂，创建线程的具体位置
                new ThreadPoolExecutor.AbortPolicy());// 当线程都在工作且任务仍存在时，处理不过来该怎么办？这个类中处理这种情况
        Future<String> f1 = pool.submit(new MyCallableThread(100));
        Future<String> f2 = pool.submit(new MyCallableThread(200));
        Future<String> f3 = pool.submit(new MyCallableThread(300));
        Future<String> f4 = pool.submit(new MyCallableThread(400));

        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());
    }
}
