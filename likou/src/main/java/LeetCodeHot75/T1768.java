package LeetCodeHot75;

public class T1768 {
    public String mergeAlternately(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        StringBuilder res = new StringBuilder();
        if (length1 == 0){
            return res.append(word2).toString();
        }else if (length2 == 0){
            return res.append(word1).toString();
        }
        int diff = Math.abs(length1 - length2);
        int min = Math.min(length1,length2);
        char[] c1 = word1.toCharArray();
        char[] c2 = word2.toCharArray();
        for (int i = 0; i < min; i++) {
            res.append(c1[i]);
            res.append(c2[i]);
        }
        boolean flag = min == length1;
        for (int i = min; i < min + diff; i++) {
            if (flag){
                res.append(c2[i]);
            }else {
                res.append(c1[i]);
            }
        }
        return res.toString();
    }
}
