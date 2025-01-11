package baiduZhixing;

import java.util.Scanner;

/**
 * @Author htt
 * @Date 2024/6/30
 */


public class T4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] stones = new int[N];

        // 读取魔法石的种类
        for (int i = 0; i < N; i++) {
            stones[i] = scanner.nextInt();
        }

        // 计算原始能量
        int originalEnergy = getMaxContiguousCount(stones);

        // 遍历每种魔法石,计算删除后能量的最大增加量
        int maxIncrement = 0;
        for (int i = 0; i < N; i++) {
            int[] newStones = new int[N - 1];
            int index = 0;
            for (int j = 0; j < N; j++) {
                if (j != i) {
                    newStones[index++] = stones[j];
                }
            }
            int newEnergy = getMaxContiguousCount(newStones);
            int increment = newEnergy - originalEnergy;
            maxIncrement = Math.max(maxIncrement, increment);
        }

        System.out.println(maxIncrement);
    }

    private static int getMaxContiguousCount(int[] stones) {
        int maxCount = 0;
        int currentCount = 1;
        for (int i = 1; i < stones.length; i++) {
            if (stones[i] == stones[i - 1]) {
                currentCount++;
            } else {
                maxCount = Math.max(maxCount, currentCount);
                currentCount = 1;
            }
        }
        return Math.max(maxCount, currentCount);
    }

}
