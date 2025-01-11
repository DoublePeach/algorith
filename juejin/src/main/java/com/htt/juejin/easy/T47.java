package com.htt.juejin.easy;

/**
 * @Author htt
 * @Date 2025/1/11
 */
public class T47 {
    public static int solution(int n, int l, int r, int[] a) {
        // PLEASE DO NOT MODIFY THE FUNCTION SIGNATURE
        // write code here
        int count = 0;
        for (int j : a) {
            if (j >= l && j <= r && j % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, 3, 8, new int[]{1, 2, 6, 8, 7}) == 2);
        System.out.println(solution(4, 10, 20, new int[]{12, 15, 18, 9}) == 2);
        System.out.println(solution(3, 1, 10, new int[]{2, 4, 6}) == 3);
    }
}
