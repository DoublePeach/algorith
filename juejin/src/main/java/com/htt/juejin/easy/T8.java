package com.htt.juejin.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author htt
 * @Date 2025/1/15
 */
public class T8 {
    public static int solution(int[] array) {
        // Edit your code here
        int mid = array.length / 2;
        Map<Integer,Integer> map = new HashMap<>();
        for (int x : array){
            int currK = map.getOrDefault(x,0)+1;
            map.put(x,currK);
            if (Math.max(currK,mid) != mid){
                return x;
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        // Add your test cases here

        System.out.println(solution(new int[]{1, 3, 8, 2, 3, 1, 3, 3, 3}) == 3);
    }
}
