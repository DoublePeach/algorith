package com.htt.java.QuestionOfDay;

/**
 * 3033. 修改矩阵
 * 给你一个下标从 0 开始、大小为 m x n 的整数矩阵 matrix ，
 * 新建一个下标从 0 开始、名为 answer 的矩阵。使 answer 与 matrix 相等，
 * 接着将其中每个值为 -1 的元素替换为所在列的 最大 元素。
 * 返回矩阵 answer 。
 * @Author htt
 * @Date 2024/7/5
 */
public class q_3033 {

    public int[][] modifiedMatrix(int[][] matrix) {

        for (int j = 0; j < matrix[0].length; j++) {
            int max = 0;
            for(int[] row : matrix){
                max = Math.max(row[j],max);
            }
            for (int[] row : matrix){
                if (row[j] == -1){
                    row[j] = max;
                }

            }
        }
        return matrix;
    }
}
