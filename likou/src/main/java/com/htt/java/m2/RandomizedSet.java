package com.htt.java.m2;

import java.util.Arrays;
import java.util.Scanner;

public class RandomizedSet {

    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {
            int value = sc.nextInt();
            boolean insert = randomizedSet.insert(value);
            System.out.println(insert);
            System.out.println(Arrays.toString(randomizedSet.arr));
        }
    }
    int[] arr;
    int index;

    public RandomizedSet() {
        arr = new int[500];
        arr[0] = Integer.MAX_VALUE; // 0 的特殊情况
        index = 0;
    }

    public boolean insert(int val) {
       if (arr[val] == val){
           return false;
       }
        arr[val] = val;
        return true;
    }

    public boolean remove(int val) {
        if (arr[val] == val){
            arr[val] = 0;
            return true;
        }
        return false;
    }

    public int getRandom() {

        return 0;
    }



    /**
     * Your RandomizedSet object will be instantiated and called as such:
     * RandomizedSet obj = new RandomizedSet();
     * boolean param_1 = obj.insert(val);
     * boolean param_2 = obj.remove(val);
     * int param_3 = obj.getRandom();
     */
}
