package com.htt.juejin.easy;

/**
 * @Author htt
 * @Date 2025/1/21
 */
import java.util.HashMap;
import java.util.Map;

public class T29 {
    public static String solution(String s, int k) {
        // write code here
        Map<Integer,String> map = new HashMap<>();
        map.put(0,s);
        for (int i = 1; i <= k; i++) {
            String curr = map.get(i - 1);
            String kres = toTrans(curr,k);
            map.put(i,kres);
        }
        return  map.get(k);
    }

    private static String toTrans(String str,int k) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            switch (c){
                case 'a': sb.append("bc"); break;
                case 'b': sb.append("ca"); break;
                case 'c': sb.append("ab"); break;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(solution("abc", 2).equals("caababbcbcca"));
        System.out.println(solution("abca", 3).equals("abbcbccabccacaabcaababbcabbcbcca"));
        System.out.println(solution("cba", 1).equals("abcabc"));
    }
}
