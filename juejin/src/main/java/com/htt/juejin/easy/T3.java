package com.htt.juejin.easy;

/**
 * @Author htt
 * @Date 2025/1/20
 */
public class T3 {
    public static String solution(String s) {
        // 去掉前导零
        s = s.replaceFirst("^0+(?!$)", "");

        // 分割整数和小数部分
        String[] parts = s.split("\\.");
        String integerPart = parts[0];
        String decimalPart = parts.length > 1 ? "." + parts[1] : "";

        // 格式化整数部分
        StringBuilder formattedInteger = new StringBuilder();
        int length = integerPart.length();
        for (int i = 0; i < length; i++) {
            if (i > 0 && (length - i) % 3 == 0) {
                formattedInteger.append(","); // 每三位添加一个逗号
            }
            formattedInteger.append(integerPart.charAt(i));
        }

        // 返回拼接后的结果
        return formattedInteger.toString() + decimalPart;
    }

    public static void main(String[] args) {
        System.out.println(solution("1294512.12412").equals("1,294,512.12412"));
        System.out.println(solution("0000123456789.99").equals("123,456,789.99"));
        System.out.println(solution("987654321").equals("987,654,321"));
    }
}
