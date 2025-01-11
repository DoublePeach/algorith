package com.htt.java.QuestionOfDay;

/**
 * 740. 删除并获得点数
 * 给你一个整数数组 nums ，你可以对它进行一些操作。
 * 每次操作中，选择任意一个 nums[i] ，删除它并获得 nums[i] 的点数。之后，你必须删除 所有 等于 nums[i] - 1 和 nums[i] + 1 的元素。
 * 开始你拥有 0 个点数。返回你能通过这些操作获得的最大点数。
 * @Author htt
 * @Date 2024/7/2
 */
public class q_740 {

    public int deleteAndEarn(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= i){
                System.out.println("aa ");
            }
        }

        return 1;

    }
}
