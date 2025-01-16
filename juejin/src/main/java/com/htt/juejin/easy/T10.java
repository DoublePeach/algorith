package com.htt.juejin.easy;

/**
 * @Author htt
 * @Date 2025/1/15
 */
public class T10 {
    public static int solution(int a, int b) {
        int res = a / b;
        if ((a % b) != 0){
            res++;
        }
        // write code here
        return res;
    }

    public static void main(String[] args) {
        System.out.println(solution(10, 1) == 10);
        System.out.println(solution(10, 2) == 5);
        System.out.println(solution(10, 3) == 4);
    }
}
