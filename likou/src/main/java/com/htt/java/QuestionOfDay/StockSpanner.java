package com.htt.java.QuestionOfDay;

import java.util.*;

/**
 * 901. 股票价格跨度
 * 设计一个算法收集某些股票的每日报价，并返回该股票当日价格的 跨度 。
 * 当日股票价格的 跨度 被定义为股票价格小于或等于今天价格的最大连续日数（从今天开始往回数，包括今天）。
 * 例如，如果未来 7 天股票的价格是 [100,80,60,70,60,75,85]，那么股票跨度将是 [1,1,1,2,1,4,6] 。
 * 实现 StockSpanner 类：
 * StockSpanner() 初始化类对象。
 * int next(int price) 给出今天的股价 price ，返回该股票当日价格的 跨度 。
 */
public class StockSpanner {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> tempStack = new Stack<>();

    public StockSpanner() {
    }

    public int next(int price) {
        List<Integer> currDpushEle = new ArrayList<>();
        int res = 1;
        while(!stack.isEmpty()){
            if (price >= stack.peek()){
                Integer pop = stack.pop();
                currDpushEle.add(pop);
                res++;
            }else {
                for (Integer x :currDpushEle){
                    stack.push(x);
                }
                stack.push(price);
                return res;
            }
        }
        for (Integer x :currDpushEle){
            stack.push(x);
        }
        stack.push(price);

        return res;
    }


    private final Deque<int[]> stk = new ArrayDeque<>();

    public int next2(int price) {
        int cnt = 1;
        while (!stk.isEmpty() && stk.peek()[0] <= price) {
            cnt += stk.pop()[1];
        }
        stk.push(new int[] {price, cnt});
        return cnt;
    }

}
