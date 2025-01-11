package baiduZhixing;
import java.io.*;
import java.util.*;
/**
 * @Author htt
 * @Date 2024/6/30
 */


public class T3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int q = Integer.parseInt(inputs[1]);
        String s = br.readLine();

        int[][] dp = new int[n+1][n+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i-1) == s.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.min(dp[i-1][j-1] + 1, Math.min(dp[i-1][j], dp[i][j-1]));
                }
            }
        }

        for (int i = 0; i < q; i++) {
            inputs = br.readLine().split(" ");
            int l1 = Integer.parseInt(inputs[0]);
            int r1 = Integer.parseInt(inputs[1]);
            int l2 = Integer.parseInt(inputs[2]);
            int r2 = Integer.parseInt(inputs[3]);

            int minModification = dp[r1][r2] - dp[r1][l2-1] - dp[l1-1][r2] + dp[l1-1][l2-1];
            Set<Character> modifyChars = new HashSet<>();

            for (int j = l1-1; j < r1; j++) {
                if (s.charAt(j) != s.charAt(j-l1+l2-1)) {
                    modifyChars.add(s.charAt(j));
                }
            }

            System.out.println(minModification + " " + modifyChars);
        }
    }
}
