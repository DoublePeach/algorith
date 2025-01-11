package com.htt.java.doublePointer;

import java.util.Arrays;

/**
 * 167. 两数之和 II - 输入有序数组
 * 给你一个下标从 1 开始的整数数组 numbers ，该数组已按 非递减顺序排列  ，
 * 请你从数组中找出满足相加之和等于目标数 target 的两个数。
 * 如果设这两个数分别是 numbers[index1] 和 numbers[index2] ，则 1 <= index1 < index2 <= numbers.length 。
 * 以长度为 2 的整数数组 [index1, index2] 的形式返回这两个整数的下标 index1 和 index2。
 */
public class Solution3 {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(twoSum(new int[]{5, 25, 75}, 100)));
//        System.out.println(Arrays.toString(twoSum(new int[]{3,24,50,79,88,150,345}, 200)));
        System.out.println(Arrays.toString(twoSum(new int[]{1,3,4,4}, 8)));
//        System.out.println(Arrays.toString(twoSum(new int[]{12,13,23,28,43,44,59,60,61,68,70,86,88,92,124,125,136,168,173,173,180,199,212,221,227,230,277,282,306,314,316,321,325,328,336,337,363,365,368,370,370,371,375,384,387,394,400,404,414,422,422,427,430,435,457,493,506,527,531,538,541,546,568,583,585,587,650,652,677,691,730,737, 740,751,755,764,778,783,785,789,794,803,809,815,847,858,863,863,874,887,896,916,920,926,927,930,933,957,981,997}, 542)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int pre = 0; int last = numbers.length-1;
        while(pre<last){
            int num = numbers[pre] + numbers[last];
            if (num == target){
                return new int[]{pre+1,last+1};
            } else if (num > target ){
                last--;
            } else {
                pre++;
            }
        }
        return new int[]{-1,-1};
    }
}
