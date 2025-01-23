package com.htt.juejin.mid;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author htt
 * @Date 2025/1/21
 */
public class T31 {
    public static int solution(String word) {
        // write code here
        Set<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        char[] charArray = word.toCharArray();
        for (int i = 0 ; i < charArray.length;i++){
            if (charArray[i] < 96){
                sb.append(charArray[i]);
            }else if (charArray[i] >= 96 && sb.length() > 0){
                set.add(Integer.valueOf(sb.toString()));
                sb.delete(0,sb.length());
            }
        }
        if (!sb.toString().isEmpty()){
            set.add(Integer.valueOf(sb.toString()));
        }
        return set.size();
    }

    public static void main(String[] args) {
        System.out.println(solution("a123bc34d8ef34") == 3);
        System.out.println(solution("t1234c23456") == 2);
        System.out.println(solution("a1b01c001d4") == 2);
    }
}
