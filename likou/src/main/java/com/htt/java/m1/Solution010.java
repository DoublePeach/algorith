package com.htt.java.m1;

import java.util.Arrays;

/**
 * 274. H 指数
 * 给你一个整数数组 citations ，其中 citations[i] 表示研究者的第 i 篇论文被引用的次数。计算并返回该研究者的 h 指数。
 * 根据维基百科上 h 指数的定义：h 代表“高引用次数” ，一名科研人员的 h 指数 是指他（她）至少发表了 h 篇论文，
 * 并且 至少 有 h 篇论文被引用次数大于等于 h 。如果 h 有多种可能的值，h 指数 是其中最大的那个。
 */
public class Solution010 {
    public static void main(String[] args) {
        System.out.println(hIndex(new int[]{3,0,6,1,5}));
        System.out.println(hIndex(new int[]{0,0}));
        System.out.println(hIndex3(new int[]{3,2,4,1}));
    }

    public static int hIndex3(int[] citations) {
        Arrays.sort(citations);
        int h = 0, i = citations.length - 1;
        while (i >= 0 && citations[i] > h) {
            h++;
            i--;
        }
        return h;
    }

    public static int hIndex(int[] citations) {
        if (citations.length == 1 && citations[0] == 0){

            return 0;
        }
        int h = 0;
        int count = 0;
        for (int i = 0; i < citations.length; i++) {
            h = citations[i];
            for (int j = i; j < citations.length; j++) {
                if ((citations[j] - h) >= 0) {
                    ++count;
                }
                if (count >= citations[i]) {
                    return count;
                }
            }
        }
        return count;
    }

    public static int hIndex2(int[] citations) {
        int maxYinyong;
        int maxCount;
        return 0;
    }

}


