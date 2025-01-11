package com.htt.java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test {

    public static String getYesterDay(){
        LocalDate localDate = LocalDate.now().minusDays(1);
        String date = localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        return date;
    }

    public static void main(String[] args) {
        System.out.println(Test.getYesterDay());
    }

//    编写代码，统计1~100之间有多少个偶数。
    public void countNum(){

    }
}
