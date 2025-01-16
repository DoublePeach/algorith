package com.htt.juejin.mid;

/**
 * @Author htt
 * @Date 2025/1/16
 */
public class T11 {
    public static int solution(int[] values) {
        if (values == null || values.length < 2) {
            throw new IllegalArgumentException("The input array must contain at least two elements.");
        }

        int n = values.length;
        int maxScore = Integer.MIN_VALUE;

        // 初始化第一个元素
        int maxValuesWithPositiveIndex = values[0] + 0; // index = 0

        for (int j = 1; j < n; j++) {
            // 计算当前考量的景点评价且与前面已记录的最大值结合
            maxScore = Math.max(maxScore, maxValuesWithPositiveIndex + values[j] - j);

            // 更新 maxValuesWithPositiveIndex
            maxValuesWithPositiveIndex = Math.max(maxValuesWithPositiveIndex, values[j] + j);
        }

        return maxScore;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{8, 3, 5, 5, 6}) == 11 ? 1 : 0);
        System.out.println(solution(new int[]{10, 4, 8, 7}) == 16 ? 1 : 0);
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}) == 8 ? 1 : 0);
    }
}
