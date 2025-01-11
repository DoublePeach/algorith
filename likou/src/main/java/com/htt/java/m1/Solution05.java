package com.htt.java.m1;

import java.util.Arrays;

/**
 * 189. 轮转数组
 * 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 */
public class Solution05 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(new int[]{1, 2, 3, 4, 5}, 2, 4)));
        rotate(new int[]{1, 2, 3, 4, 5,6,7},2);

    }
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 反转数组
     * @param nums 数组
     * @param start 反转起始下标
     * @param end 反转结束下标
     */
    public static int[] reverse(int[] nums,int start,int end){
        int temp;
        while(start<end){
            temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
        return nums;
    }
}
