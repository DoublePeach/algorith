package baiduZhixing;

import java.util.Scanner;

/**
 * @Author htt
 * @Date 2024/6/30
 */
public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dirs = new int[N+1];
        for (int i = 1; i <= N; i++) {
            int step = sc.nextInt();
            char dirction = sc.next().charAt(0);
            if (dirction == 'R'){
                for (int j = i; j < i+step; j++) {
                    dirs[j] = (dirs[j] + 1) % 4;
                }
            }else {
                for (int j = i; j < i+step; j++) {
                    dirs[j] = (dirs[j] + 3) % 4;
                }
            }
        }

        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (dirs[i] == 1){
                count ++;
            }

        }
        System.out.println(count);




    }

}
