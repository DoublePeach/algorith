package com.htt.java.dp;

/**
 * 70. 爬楼梯
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 */
public class Solution01 {

    public static void main(String[] args) {
        System.out.println(climbStairs(1));
    }
    public static int climbStairs(int n) {
        int[] dp = new int[n+2];
        dp[1] = 1;
        dp[2] = 2;
        for (int i =3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

}
