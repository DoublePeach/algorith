package com.htt.java.QuestionOfDay;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 */
public class q_402 {
    public static void main(String[] args) {
        System.out.println(removeKdigits("112",1));
    }
    public static String removeKdigits(String num, int k) {
        Deque<Character> stack = new ArrayDeque<>(num.length());
        for(char c : num.toCharArray()){
            while(k > 0 && !stack.isEmpty() && c < stack.peek()){
                stack.pop();
                k--;
            }
            if( c != '0' || !stack.isEmpty()){
                stack.push(c);

            }
        }
        while( k > 0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }

        StringBuffer buffer = new StringBuffer();
        while(!stack.isEmpty()){
            buffer.append(stack.pollLast());
        }

        return buffer.length() == 0 ? "0" : buffer.toString();
    }
}
