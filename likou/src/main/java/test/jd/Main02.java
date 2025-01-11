package test.jd;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
//        in.nextLine();
        int[] h1 = new int[n];
        int[] h2 = new int[m];

        String s1 = in.nextLine();
        String s2 = in.nextLine();
        for (int i = 0; i < s1.length(); i++) {
            h1[i] = s1.charAt(i) - '0';
        }
        for (int i = 0; i < s2.length(); i++) {
            h2[i] = s2.charAt(i) - '0';
        }
        int[][] dp = new int[n+1][m+1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0){
                    dp[i][j] = j;
                }else if (j == 0){
                    dp[i][j] = i;
                }else {
                    dp[i][j] = Integer.MAX_VALUE;
                    if (h1[i-1] + h2[j-1] <= 3){
                        dp[i][j] = Math.min(dp[i][j],dp[i-1][j-1]);
                    }
                    dp[i][j] = Math.min(dp[i][j],dp[i-1][j] +1);
                    dp[i][j] = Math.min(dp[i][j],dp[i][j-1] +1);

                }
            }
        }
        System.out.println(dp[n][m] + (n+m-Math.min(n,m)));

    }
}
