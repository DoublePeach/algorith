package com.htt.juejin.easy;

import java.util.HashSet;

/**
 * @Author htt
 * @Date 2025/1/15
 */
public class T1 {
    public static int solution(int[] cards) {
        // Edit your code here
        HashSet<Object> set = new HashSet<>();

        for (int card : cards) {
            if (set.add(card)) {
                continue;
            } else {
                set.remove(card);

            }
        }
        return (int) set.iterator().next();
    }

    public static void main(String[] args) {
        // Add your test cases here

        System.out.println(solution(new int[]{1, 1, 2, 2, 3, 3, 4, 5, 5}) == 4);
        System.out.println(solution(new int[]{0, 1, 0, 1, 2}) == 2);
    }
}
