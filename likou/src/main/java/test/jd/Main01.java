package test.jd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别

        int n = in.nextInt();
        int m = in.nextInt();
        int a = in.nextInt();

        List<int[]>[] gra = new List[n + 1];
        for (int i = 1; i <= n; i++) {
            gra[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            int w = in.nextInt();
            gra[u].add(new int[]{v, w});
        }
        long[][] dp = new long[n + 1][a + 1];
        dp[1][0] = 1;
        for (int j = 0; j <= a; j++) {
            for (int u = 1; u <= n ; u++) {
                if (dp[u][j] >0){
                    for (int[] e :gra[u]){
                        int v = e[0];
                        int w = e[1];
                        if (j +w <= a){
                            dp[v][j +w] += dp[u][j];
                        }
                    }
                }
            }
        }
        long res = dp[n][a];
        if (res >= 20220201){
            System.out.println("All roads lead to Home!");
            System.out.println(res % 20220201);
        }else {
            System.out.println(res);
        }


    }
}
