package test.doubao;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author htt
 * @Date 2024/12/21
 */
public class T69 {
    public static String solution(int[] nums, int k) {
        // Please write your code here
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> res = map.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()) // 按照 Value 降序排序
                .limit(k) // 只取前 k 个
                .map(Map.Entry::getKey) // 提取 Key
                .sorted() // 再次升序排序
                .collect(Collectors.toList()); // 收集为 List
        StringBuilder sb = new StringBuilder();
        for (int curr : res){
            sb.append(curr).append(",");
        }
        // 移除最后一个逗号
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        //  You can add more test cases here
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int[] nums2 = {1};

        System.out.println(solution(nums1, 2).equals("1,2"));
        System.out.println(solution(nums2, 1).equals("1"));
    }
}
