package test.A360;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            y[i] = in.nextInt();
        }
        int maxR = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
//                int disX = Math.abs(x[i] - x[j]);
//                int disY = Math.abs(y[i] - y[j]);
//                if (disX - disY <= k){
//                    count++;
//                }
                int dis = Math.abs(x[i] - x[j]) + Math.abs(y[i] - y[j]);
                if (dis <= k) count++;
            }
            maxR = Math.max(maxR,count);
        }
        System.out.println(maxR);
    }
}
