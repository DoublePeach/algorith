package com.htt.java.m2;

/**
 * 134. 加油站
 * 在一条环路上有 n 个加油站，其中第 i 个加油站有汽油 gas[i] 升。
 * 你有一辆油箱容量无限的的汽车，从第 i 个加油站开往第 i+1 个加油站需要消耗汽油 cost[i] 升。
 * 你从其中的一个加油站出发，开始时油箱为空。
 * 给定两个整数数组 gas 和 cost ，如果你可以按顺序绕环路行驶一周，则返回出发时加油站的编号，否则返回 -1 。
 * 如果存在解，则 保证 它是 唯一 的。
 */
public class Solution2 {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int before = 0; // 表示到达某一个加油站且未加油时的油量
        for (int n = 0; n < gas.length; n++) {

            for (int i = 0; i < gas.length - 1; i++) {
                before = gas[i] - cost[i];
                if ((before + gas[i] - cost[i] + gas[i + 1]) > cost[i + 1]) {
                    continue;
                }

                if (before < 0) {
                    continue;
                }
                return i;
            }
        }
        return -1;
    }
}

class Solution {
    public static void main(String[] args) {
        System.out.println(canCompleteCircuit(new int[]{1,2,3,4,5},new int[]{3,4,5,1,2}));
    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int sum = 0;
        int min = 0;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            sum += gas[i] - cost[i];
            if (sum < min) {
                min = sum;
                idx = i + 1;
            }
        }
        return sum < 0 ? -1 : idx;
    }
}
