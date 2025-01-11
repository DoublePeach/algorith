package com.htt.java.m1;
/**
 * 43-字符串相乘
 */
public class Solution01 {
    public static void main(String[] args) {
        System.out.println(multiply("1234","567"));
    }

    /**
     * 正解
     */
    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int m = num1.length(), n = num2.length();
        int[] ansArr = new int[m + n];
        for (int i = m - 1; i >= 0; i--) {
            int x = num1.charAt(i) - '0';
            for (int j = n - 1; j >= 0; j--) {
                int y = num2.charAt(j) - '0';
                ansArr[i + j + 1] += x * y;
            }
        }
        for (int i = m + n - 1; i > 0; i--) {
            ansArr[i - 1] += ansArr[i] / 10;
            ansArr[i] %= 10;
        }
        int index = ansArr[0] == 0 ? 1 : 0;
        StringBuffer ans = new StringBuffer();
        while (index < m + n) {
            ans.append(ansArr[index]);
            index++;
        }
        return ans.toString();
    }
    /*public static String multiply(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        int mult = 0; // 进位
        int temp_res = 0;
        String res = "";
        String pre_res = "";
        StringBuffer curr = new StringBuffer();
        while(i>=0||j>=0||mult!=0){
            int n1 = num1.charAt(i) - '0'; // 获取每个乘数
            int n2 = num2.charAt(j) - '0';
            if (n1==0 || n2==0){
                curr.append(0);
                continue;
            }
            // 模拟乘法竖式
            temp_res = n1 * n2 + mult;
            curr.append(temp_res%10);
            mult = temp_res/10;
            i--;
            if (i<0){
                j--;
                i = num1.length()-1;
                curr.reverse(); // 反转结果集得到本轮相乘得到的临时结果
                res = curr.toString();
                res = add(res,pre_res); // 将所得结果进行相加
                pre_res = res;
                curr.delete(0,curr.length());
            }
        }

        return res;
    }

    private static String add(String num1, String num2) {
        if (num1==null || num2 ==null){
            return "";
        }else if ("".equals(num1) && "".equals(num2) ){
            return "";
        } else if ("".equals(num1)) {
            return num2;
        } else if ("".equals(num2)) {
            return num1;
        }

        int i = num1.length() - 1 ;
        int j = num2.length() - 1 ;
        int add = 0; // 进位
        int res = 0; int x ,y;
        StringBuffer curr = new StringBuffer();
        while(i >= 0 || j >= 0 || add != 0){
            x = i>=0 ? num1.charAt(i) - '0' : 0;// 数据位不一致时补零
            y = j>=0 ? num2.charAt(j) - '0' : 0;// 数据位不一致时补零
            res = x + y + add;
            curr.append(res%10);
            add = res/10;
            i--;
            j--;
        }
        curr.reverse();
        return curr.toString();
    }*/
}
