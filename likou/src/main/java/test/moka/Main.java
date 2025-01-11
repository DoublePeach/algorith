package test.moka;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,5,7,6,1};

        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        List<Integer> list = new ArrayList<>();
        List<Map.Entry<Integer,Integer>> list2 = new ArrayList<>();
        // 重复数字
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
                list.add(entry.getKey());
            }else {
                list2.add(entry);
            }
        }
        List<Integer> list3 = new ArrayList<>();
        // 排序
        Collections.sort(list2,(a,b)->b.toString().compareTo(a.toString()));

        // 提取
        for(Map.Entry<Integer,Integer> entry : list2){
            list3.add(entry.getKey());
        }

        System.out.println(list);
        System.out.println(list3);

    }

}
