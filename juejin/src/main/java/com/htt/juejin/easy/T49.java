package com.htt.juejin.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author htt
 * @Date 2025/1/12
 */
public class T49 {
    public static List<String> solution(int n, List<String> s, List<Integer> x) {
        // 使用列表存储参与者信息，每个元素是一个对象包含姓名和金额
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            people.add(new Person(s.get(i), x.get(i)));
        }

        // 排序，根据金额进行降序排列，金额相同则按名字升序排列
        people.sort((a, b) -> {
            int amountComparison = Integer.compare(b.amount, a.amount); // 降序比较金额
            return amountComparison != 0 ? amountComparison : a.name.compareTo(b.name); // 相同金额时按名称升序比较
        });

        // 提取排名结果，只保留前六名（或根据需要修改）
        Set<String> resultSet = new LinkedHashSet<>(); // 用于防止重复并保持插入顺序
        for (Person person : people) {
            if (resultSet.size() < 6) { // 控制最大的返回数量为6
                resultSet.add(person.name);
            } else {
                break;
            }
        }

        return new ArrayList<>(resultSet); // 将集合转换为列表返回
    }
    static class Person {
        String name;
        int amount;

        Person(String name, int amount) {
            this.name = name;
            this.amount = amount;
        }
    }
    public static void main(String[] args) {
        System.out.println(solution(4, Arrays.asList("a", "b", "c", "d"), Arrays.asList(1, 2, 2, 1)).equals(Arrays.asList("b", "c", "a", "d")));
        System.out.println(solution(3, Arrays.asList("x", "y", "z"), Arrays.asList(100, 200, 200)).equals(Arrays.asList("y", "z", "x")));
        System.out.println(solution(5, Arrays.asList("m", "n", "o", "p", "q"), Arrays.asList(50, 50, 30, 30, 20)).equals(Arrays.asList("m", "n", "o", "p", "q")));
    }
}
