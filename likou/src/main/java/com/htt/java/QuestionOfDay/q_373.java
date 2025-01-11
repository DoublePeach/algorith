package com.htt.java.QuestionOfDay;

import java.util.ArrayList;
import java.util.List;

/**
 * 查找和最小的 K 对数字
 * 给定两个以 非递减顺序排列 的整数数组 nums1 和 nums2 , 以及一个整数 k 。
 * 定义一对值 (u,v)，其中第一个元素来自 nums1，第二个元素来自 nums2 。
 * 请找到和最小的 k 个数对 (u1,v1),  (u2,v2)  ...  (uk,vk) 。
 *
 * @Author htt
 * @Date 2024/7/1
 */
public class q_373 {
    public static void main(String[] args) {
        System.out.println(kSmallestPairs(new int[]{1, 7, 11}, new int[]{2, 4, 6}, 3));
    }

    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> list = new ArrayList<>();


        for (int i = 0, j = 0; i < nums1.length; ) {
            if (k == 0) return list;
            List<Integer> currList = new ArrayList<>();
            if (nums1[i] < nums2[j]) {
                currList.add(nums1[i]);
                currList.add(nums2[j]);
                j++;
            } else if (nums1[i] == nums2[j]) {
                if (i < nums1.length - 1) {
                    currList.add(nums1[i]);
                    currList.add(nums2[j]);
                    int temp1 = nums1[i + 1] > nums2[j + 1] ? j++ : i++;
                }
            } else {
                currList.add(nums1[i]);
                currList.add(nums2[j]);
                i++;
            }
            list.add(currList);
            k--;
        }


        return list;
    }
}
