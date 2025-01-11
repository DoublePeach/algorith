package com.htt.java.QuestionOfDay;

/**
 * 3115. 质数的最大距离
 * 给你一个整数数组 nums。
 * 返回两个（不一定不同的）质数在 nums 中 下标 的 最大距离。
 * @Author htt
 * @Date 2024/7/2
 */
public class q_3115 {
    public int maximumPrimeDifference(int[] nums) {
        int begin = 0,end = 0;
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i])){
                if (a == 0){
                    begin = i;
                    a = -1;
                }
                end = i;
            }
        }
        return end-begin;
    }


    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

