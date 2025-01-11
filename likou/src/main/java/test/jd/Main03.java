package test.jd;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            int b = in.nextInt();
            int n = 1;
            while(true){
                int xn = (n * (n +1)) /2;
                int xn1 = (n+1) * (n +2) /2;
                if (xn <= a && a<= xn1 && xn <= b && b<= xn1){
                    int th = a -xn;
                    System.out.println(th);
                    break;
                }
                n++;
            }

        }
        in.close();
    }
}
