package baiduZhixing;

import java.util.Scanner;

/**
 * @Author htt
 * @Date 2024/6/30
 */


public class T6 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(maxLength(s, t));
    }

    public static int maxLength(String s, String t) {
        int m = s.length(), n = t.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (t.charAt(j - 1) == '*') {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                } else if (t.charAt(j - 1) == '+') {
                    if (s.charAt(i - 1) == t.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    } else {
                        dp[i][j] = dp[i][j - 1];
                    }
                } else if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }

        return dp[m][n];
    }




}
