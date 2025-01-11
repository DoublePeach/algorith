package com.htt.java.HashTable;

import java.util.HashMap;

/**
 * 205. 同构字符串
 * 给定两个字符串 s 和 t ，判断它们是否是同构的。
 * 如果 s 中的字符可以按某种映射关系替换得到 t ，那么这两个字符串是同构的。
 * 每个出现的字符都应当映射到另一个字符，同时不改变字符的顺序。
 * 不同字符不能映射到同一个字符上，相同字符只能映射到同一个字符上，字符可以映射到自己本身。
 */
public class Solution2 {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg","add"));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            if (map1.containsKey(sc)) {
                map1.put(sc, map1.getOrDefault(sc, 0) + 1);
            }else map1.put(sc, 1);

            char tc = t.charAt(i);
            if (map2.containsKey(tc)) {
                map2.put(tc, map2.getOrDefault(tc, 0) + 1);
            }else map2.put(tc, 1);
        }
        for (int i = 0; i < map1.size(); i++) {
            Integer value1 = map1.get(i);
            Integer value2 = map2.get(i);

            if (!value1.equals(value2)) {
                return false;
            }
        }
        return true;
    }

}
