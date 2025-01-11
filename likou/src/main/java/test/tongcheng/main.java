package test.tongcheng;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String s = in.next();
        int res = method(n,k,s);
        System.out.println(res);
    }

    public static int method(int n,int k,String s){
        int minM = Integer.MAX_VALUE;
        for (char target  = '0' ; target <= '9' ;target++){
            int[] count = new  int[10];
            int curr = 0;
            for (int i = 0;i< k ;i++){
                count[s.charAt(i) - '0']++;
            }
            for(int i = 0;i<k;i++){
                curr += Math.abs(s.charAt(i) -target);
            }
            for (int i = 0; i < n; i++) {
                curr -= Math.abs(s.charAt(i - k) -target);
                curr += Math.abs(s.charAt(i) -target);
                minM = Math.min(minM,curr);
            }
        }
        return minM;
    }
}
