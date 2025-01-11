package com.htt.java.m1;

import java.util.Arrays;

/**
 * 27-移除元素
 */
public class Solution03 {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,2,2,3},3));
        System.out.println(removeElement2(new int[]{3,2,2,3},3));

    }
    public static int removeElement(int[] nums, int val) {
        int count = nums.length;
        int last = nums.length-1;
        for (int i = 0; i < nums.length-1; i++) {
            if (i == nums.length-1 && nums[i]==val){
                count--;
            }
            if (nums[i]==val){
                nums[last] = nums[i];
                nums[i] = nums[i+1];
                count--;
                last--;
            }
        }
        return count;
    }

    /**
     * 双指针法
     */
    public static int removeElement2(int[] nums, int val) {
        int n = nums.length;
        int left = 0;
        for (int right = 0; right < n; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return left;
    }

}
