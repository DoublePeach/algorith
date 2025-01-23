package com.htt.juejin.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author htt
 * @Date 2025/1/21
 */
public class T34 {
    public static int solution(int n, int[] nums) {
        // PLEASE DO NOT MODIFY THE FUNCTION SIGNATURE
        // write code here
        int[] array = Arrays.stream(nums)
                .sorted()
                .distinct()
                .toArray();
        if (array.length == 2){
            return Math.max(array[0],array[1]);
        }
        if (array.length == 1){
            return array[0];
        }
        Set<Integer> set = new HashSet<>();

        int count = 0;
        for (int i = array.length-1; i >= 0; i--) {
            boolean add = set.add(array[i]);
            if (add && count < 3){
                count++;
            }
            if (count == 3){
                return array[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, new int[]{3, 2, 1}) == 1);
        System.out.println(solution(2, new int[]{1, 2}) == 2);
        System.out.println(solution(4, new int[]{2, 2, 3, 1}) == 1);
    }
}
