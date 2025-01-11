package com.htt.java.dp;

/**
 * 63. 不同路径 II
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish”）。
 * 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
 * 网格中的障碍物和空位置分别用 1 和 0 来表示。
 */
public class Solution09 {

    public static void main(String[] args) {
        System.out.println(uniquePathsWithObstacles2(new int[][]{{0,0}, {1,1},{0,0}}));
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int clum = obstacleGrid[0].length;
        int[][] dp = new int[row][clum];
        for (int i = 0; i < row; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < clum; j++) {
            dp[0][j] = 1;
        }
        int x = 1;
        int y = 1;
        while (x < row - 2 || y < clum - 2) {
            if (obstacleGrid[x + 1][y] == 1) {
                y++;
            }
            if (obstacleGrid[x][y + 1] == 1) {
                x++;
            }
            // 状态转移方程
            dp[x][y] = dp[x - 1][y] + dp[x][y - 1];

            if (x + 1 < row) {
                x++;
            } else {
                y++;
            }
        }
        return dp[row - 2][clum - 1] + dp[row - 1][clum - 2];
    }


    public static int uniquePathsWithObstacles2(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int clum = obstacleGrid[0].length;
        int[][] dp = new int[row][clum];

        if (obstacleGrid[0][0] == 1) return 0;
        if (obstacleGrid[row - 1][clum - 1] == 1) return 0;
        if (row < 2 || clum < 2) return 1;

        for (int i = 1; i < row; i++) {
            if (obstacleGrid[i][0] == 0) {
                dp[i][0] = dp[i-1][0];
            }
        }
        for (int j = 1; j < clum; j++) {
            if (obstacleGrid[0][j] == 0) {
                dp[0][j] = dp[0][j-1];
            }
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < clum; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[row - 2][clum - 1] + dp[row - 1][clum - 2];
    }
}














