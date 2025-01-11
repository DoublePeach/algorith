package test.huice;

import java.util.*;
import java.util.stream.Collectors;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {

    }

    public List<String> find(List<String> strings){
        Set<String> seen = new LinkedHashSet<>();
        return new ArrayList<>(seen);
    }

    public List<String> find2(Map<String,Integer> map){
        return map.entrySet().stream()
                .sorted((a,b) -> b.getValue().compareTo(a.getValue()))
                .limit(3)
                .map(Map.Entry :: getKey)
                .collect(Collectors.toList());
    }

    public Map<String,Integer> find3(List<String> strings){
        Map<String, Integer> hashMap = new HashMap<>();
        int count = 0;
        for (String str : strings){
            hashMap.put(str,hashMap.getOrDefault(count++,0));
        }
        return hashMap;
    }

    public Map<String,List<String>> find4(List<String> strings){
        ArrayList<String> numbers = new ArrayList<>();
        ArrayList<String> letters = new ArrayList<>();

        for(String str:strings){
            if (str.matches("\\d+")){
                numbers.add(str);
            }else if (str.matches("[a-zA-Z]+")){
                letters.add(str);
            }
        }
        HashMap<String, List<String>> map = new HashMap<>();
        map.put("numbers",numbers);
        map.put("letters",letters);
        return map;
    }





    public Map<String,String> find6(List<String> strings){
        HashMap<String, String> map = new HashMap<>();
        for(String pair : strings){
            String[] split = pair.split(",");
            if (split.length == 2){
                String name = split[0].trim();
                String email = split[1].trim();
                map.put(email,name);
            }
        }
        return map;
    }



}