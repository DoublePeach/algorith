package com.htt.java.m3;

/**
 * 209. 长度最小的子数组
 * 给定一个含有 n 个正整数的数组和一个正整数 target 。
 * 找出该数组中满足其总和大于等于 target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，
 * 并返回其长度。如果不存在符合条件的子数组，返回 0 。
 */
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7,new int[]{2,3,1,2,4,3}));
    }

    // 滑动窗口解法
    public static int minSubArrayLen(int target, int[] nums) {
        int start = 0; int end = 0;
        int sum = 0;
        int res = Integer.MAX_VALUE;
        while(end < nums.length){
            sum += nums[end];
            while(sum >= target){
                res = Math.min(res,end-start+1);
                sum -= nums[start];
                start++;
            }
            end++;
        }
        return res==Integer.MAX_VALUE ? 0 : res;
    }

}
