package com.htt.java.QuestionOfDay;

/**
 * 给你一个非负整数数组 nums 和一个整数 target 。
 * 向数组中的每个整数前添加 '+' 或 '-' ，然后串联起所有整数，可以构造一个 表达式 ：
 * 例如，nums = [2, 1] ，可以在 2 之前添加 '+' ，在 1 之前添加 '-' ，然后串联起来得到表达式 "+2-1" 。
 * 返回可以通过上述方法构造的、运算结果等于 target 的不同 表达式 的数目。
 * @Author htt
 * @Date 2024/6/30
 */
public class q_494 {
    public static void main(String[] args) {
        System.out.println();
    }

    public int findTargetSumWays(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
//             if (sumNums(bodySums) == (target+sumNums(nums))/2){
//
//             }
        }



        return 1;
    }

    public int sumNums(int[] nums){
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        return sum;
    }
}
