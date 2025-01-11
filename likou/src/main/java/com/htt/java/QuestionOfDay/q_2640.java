package com.htt.java.QuestionOfDay;

import java.util.Arrays;

/**
 * 2640. 一个数组所有前缀的分数
 * 定义一个数组 arr 的 转换数组 conver 为：
 * conver[i] = arr[i] + max(arr[0..i])，其中 max(arr[0..i]) 是满足 0 <= j <= i 的所有 arr[j] 中的最大值。
 * 定义一个数组 arr 的 分数 为 arr 转换数组中所有元素的和。
 * 给你一个下标从 0 开始长度为 n 的整数数组 nums ，请你返回一个长度为 n 的数组 ans ，其中 ans[i]是前缀 nums[0..i] 的分数。
 * @Author htt
 * @Date 2024/6/29
 */
public class q_2640 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findPrefixScore(new int[]{2,3,7,5,10})));
    }

    public static long[] findPrefixScore(int[] nums) {
        int length = nums.length;
        long[] conver = new long[length];
        long[] ans = new long[length];
        conver[0] = nums[0] + nums[0];
        ans[0] = conver[0];
        long currMax = nums[0]; long temp = conver[0];
        for (int i = 1; i < length; i++) {
            if (nums[i] > currMax)
                currMax = nums[i];
            conver[i] = nums[i] + currMax;
            temp += conver[i];
            ans[i] = temp;
        }
        return ans;
    }
}
