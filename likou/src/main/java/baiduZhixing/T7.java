package baiduZhixing;

import java.util.Scanner;

/**
 * @Author htt
 * @Date 2024/6/30
 */


public class T7 {


    public static int[] maxDamage(int n, int m, int k, int q, int[] a, int[][] operations) {
        int[] q_arr = new int[n+1];
        int[][] dp = new int[n+1][m+1];

        // 计算每天开始时小度获得的能量值
        for (int i = 1; i <= n; i++) {
            q_arr[i] = q_arr[i-1] + a[i-1];
        }

        // 处理修改操作
        for (int[] op : operations) {
            if (op[0] == 1) {
                q_arr[op[1]] += op[2];
            }
        }

        // 计算dp数组
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = dp[i-1][j];
                if (j >= k) {
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][Math.max(0, j-k)] + 1);
                }
            }
        }

        // 处理询问操作
        int[] ans = new int[q];
        int idx = 0;
        for (int[] op : operations) {
            if (op[0] == 2) {
                ans[idx++] = dp[op[1]][m];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[][] operations = new int[q][3];
        for (int i = 0; i < q; i++) {
            operations[i][0] = sc.nextInt();
            operations[i][1] = sc.nextInt();
            if (operations[i][0] == 1) {
                operations[i][2] = sc.nextInt();
            } else {
                operations[i][2] = sc.nextInt();
            }
        }
        int[] ans = maxDamage(n, m, k, q, a, operations);
        for (int x : ans) {
            System.out.println(x);
        }
    }





}
