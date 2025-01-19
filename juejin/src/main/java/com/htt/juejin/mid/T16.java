package com.htt.juejin.mid;

/**
 * @Author htt
 * @Date 2025/1/17
 */
public class T16 {
    public static int solution(int n, int[] array) {
        int maxArea = 0;

        // 遍历每个可能的 k
        for (int k = 1; k <= n; k++) {
            int currentMin = Integer.MAX_VALUE;

            // 使用滑动窗口计算每个 k 个相邻元素的最小值
            for (int i = 0; i <= n - k; i++) {
                currentMin = Integer.MAX_VALUE;

                // 找到当前窗口内的最小值
                for (int j = 0; j < k; j++) {
                    currentMin = Math.min(currentMin, array[i + j]);
                }

                // 计算当前窗口的矩形面积
                int area = k * currentMin;
                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        // Add your test cases here

        System.out.println(solution(5, new int[]{1, 2, 3, 4, 5}) == 9);
    }
}
