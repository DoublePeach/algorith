package com.htt.java.dp;

/**
 * 64. 最小路径和
 * 给定一个包含非负整数的 m x n 网格 grid ，
 * 请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * 说明：每次只能向下或者向右移动一步。
 */
public class Solution08 {

// 未succeed
    public static int minPathSum(int[][] grid) {
        int high = grid.length;
        int wide = grid[0].length;
        int[][] dp = new int[high][wide];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < high; i++) {
            dp[0][i] = dp[0][i-1] + grid[0][i];
        }
        for (int j = 1; j < wide; j++) {
            dp[j][0] = dp[j-1][0] + grid[j-1][0];
        }
        for (int i = 1; i < high; i++) {
            for (int j = 1; j < wide; j++) {
                dp[i][j] = Math.min(dp[i][j-1] + grid[i][j],dp[i-1][j] + grid[i][j]);
            }
        }
        return dp[high-1][wide-1];
    }

}














