package com.htt.juejin.mid;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author htt
 * @Date 2025/1/16
 */
public class T14 {
    public static int solution(int n, int k) {
        // write code here
        List<Integer> list = new ArrayList<>();
        int num = 1;
        while(list.size() < n){
            if ((num % k) == 0){
                list.add(num);
            }
            num++;
        }
        return list.stream().mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 1) == 6);
        System.out.println(solution(2, 2) == 6);
        System.out.println(solution(4, 3) == 30);
    }
}
