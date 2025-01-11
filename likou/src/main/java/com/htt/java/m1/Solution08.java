package com.htt.java.m1;

/**
 * 搜索二维矩阵 II
 */
public class Solution08 {
    public static void main(String[] args) {

        int[][] array = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int[][] array2 = {{-5}};
        int[][] array3 = {{1,1}};
        System.out.println(searchMatrix3(array3, 0));
//        int[][] array1 = {{5}, {6}};
//        System.out.println(searchMatrix2(array1, 6));
    }

    public static boolean searchMatrix2(int[][] matrix, int target) {
        //从右上角开始搜索
        int row = 0;
        int col = matrix[0].length-1;
//        int col = matrix.length-1;
        while(col >= 0 && row <= matrix.length - 1){
            if (target==matrix[row][col]){
                return true;
            }else if(matrix[row][col]<target){
                row++;
            }else col--;
        }
        return false;
    }


    // 不太行
    public static boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = 0;
        int len = matrix.length; // 行数
        int kuan = matrix[len - 1].length;

        while (i < len && j < kuan) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] < target && j< kuan-1) {
                j++;
            } else if (matrix[i][j] > target) {
                i++;
                j = 0;
//                j = j-1;
            }
            i++;
        }
        return false;
    }

    // 2024年1月17日 第二次刷 （搜索二维矩阵：从左下角开始搜索）
    public static boolean searchMatrix3(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length-1;
        while(i<=matrix.length-1 && j>=0){
            if (matrix[i][j] == target){
                return true;
            }else if (matrix[i][j] < target){
                i++;
            }else {
                j--;
            }
        }
        return false;
    }
}


