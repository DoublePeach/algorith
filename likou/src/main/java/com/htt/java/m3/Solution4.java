package com.htt.java.m3;

/**
 * 35. 搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 请必须使用时间复杂度为 O(log n) 的算法。
 */
public class Solution4 {
    public static void main(String[] args) {
        System.out.println(searchInsert2(new int[]{1, 3, 5, 6}, 0));
    }

    // 可以解决，但题目要求必须使用logn解法
    public int searchInsert(int[] nums, int target) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target || nums[i] > target) {
                res = i;
                return res;
            }
        }
        return res == 0 ? nums.length : res;
    }

    // 二分解法
    public static int searchInsert2(int[] nums, int target) {
        int n = nums.length;
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < target)
                l = mid + 1;
            else r = mid - 1;
        }
        return l;
    }
}

