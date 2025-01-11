package com.htt.java.HashTable;

import java.util.*;

/**
 * 202. 快乐数
 * 编写一个算法来判断一个数 n 是不是快乐数。
 * 「快乐数」 定义为：
 * 对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
 * 然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
 * 如果这个过程 结果为 1，那么这个数就是快乐数。
 * 如果 n 是 快乐数 就返回 true ；不是，则返回 false 。
 */
public class Solution5 {

    // 使用Hash表的方式
    public boolean isHappy(int n) {
        Set<Integer> map = new HashSet<>();
        while( n != 1 && !map.contains(n)){
            map.add(n);
            n = nextNum(n);
        }
        return n==1;
    }

    private int nextNum(int dq) {
        int sum = 0;
        while(dq>0){
            int i = dq % 10;
            dq = dq / 10;
            sum += i * i;
        }
        return sum;
    }

}
