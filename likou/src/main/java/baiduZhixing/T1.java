package baiduZhixing;

import java.util.Scanner;

/**
 * @Author htt
 * @Date 2024/6/30
 */
public class T1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 星星数量
        int[] a = new int[n]; // 每颗星星的闪烁周期
        int[] b = new int[n]; // 每颗星星的开始闪烁时间
        int l = scanner.nextInt(); // 开始计数时间
        int r = scanner.nextInt(); // 结束计数时间
        int C = scanner.nextInt(); // 计数到 C 次及以上就睡着

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
        }

        int[] count = new int[r - l + 1]; // 记录每一秒钟有多少颗星星在闪烁
        for (int i = 0; i < n; i++) {
            for (int t = (b[i] - l) / a[i]; (t * a[i] + b[i]) <= r; t++) {
                count[t * a[i] + b[i] - l]++;
            }
        }

        int sleepTime = -1;
        int totalCount = 0;
        for (int i = 0; i < count.length; i++) {
            totalCount += count[i];
            if (totalCount >= C) {
                sleepTime = l + i;
                break;
            }
        }

        System.out.println(sleepTime);
    }


}
