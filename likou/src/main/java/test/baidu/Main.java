package test.baidu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String S = in.next();
        int n = S.length();
        // char[] res = new char[n];
        int index = 0;

        StringBuilder res = new StringBuilder();
        boolean[] moved = new boolean[n+1];
        for(int i = 1;i<=n;i++){
            char ch = S.charAt(i-1);
            if(!moved[i]){
                res.append(ch);
            }
            moved[i] = true;
        }
        System.out.println(res.toString());
    }
}
