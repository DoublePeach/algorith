package com.htt.java.m1;

/**
 * 121. 买卖股票的最佳时机
 * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 * <p>
 * 122. 买卖股票的最佳时机 II
 * 给你一个整数数组 prices ，其中 prices[i] 表示某支股票第 i 天的价格。
 * 在每一天，你可以决定是否购买和/或出售股票。你在任何时候 最多 只能持有 一股 股票。你也可以先购买，然后在 同一天 出售。
 * 返回 你能获得的 最大 利润
 */
public class Solution06 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
        System.out.println(maxProfit(new int[]{1, 2, 4, 2, 5, 7, 2, 4, 9, 0, 9}));
        System.out.println(maxProfit(new int[]{9, 3, 12, 1, 2, 3}));

        System.out.println(maxProfit2(new int[]{7,1,5,3,6,4}));
        System.out.println(maxProfit2(new int[]{1,2,3,4,5}));
        System.out.println(maxProfit2(new int[]{7,6,4,3,1}));
    }

    public static int maxProfit(int[] prices) {
        int max = 0;
        int pre = 0;
        int later = 1;
        int differ;
        while (later < prices.length) {
            if (prices[pre] >= prices[later]) {
                pre = later;
                later++;
            } else {
                differ = prices[later] - prices[pre];
                if (max < differ) {
                    max = differ;
                    later++;
                } else {
                    later++;
                }
            }

        }
        return max;
    }

    public static int maxProfit2(int[] prices) {
        int sum = 0;
        for (int i = 1; i < prices.length; ++i) {
            if (prices[i] > prices[i - 1]) {
                sum += prices[i] - prices[i - 1];
            }
        }
        return sum;
    }

    // 动态规划解决股票买入卖出问题
    public int maxProfit3(int[] prices) {
        int len = prices.length;
        if (len < 2) {
            return 0;
        }

        // 0：持有现金
        // 1：持有股票
        // 状态转移：0 → 1 → 0 → 1 → 0 → 1 → 0
        int[][] dp = new int[len][2];

        dp[0][0] = 0;
        dp[0][1] = -prices[0];

        for (int i = 1; i < len; i++) {
            // 这两行调换顺序也是可以的
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }
        return dp[len - 1][0];
    }
}
