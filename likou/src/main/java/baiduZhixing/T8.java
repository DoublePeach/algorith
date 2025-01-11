package baiduZhixing;

import java.util.Scanner;

public class T8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 游戏轮数
        int X = scanner.nextInt(); // 小度初始糖果数
        int Y = scanner.nextInt(); // 度度熊初始糖果数
        int[] A = new int[N]; // 每轮抢夺的糖果数
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int Q = scanner.nextInt(); // 操作数
        int[] type = new int[Q]; // 操作类型
        int[] s = new int[Q]; // 轮数或游戏参数编号
        int[] v = new int[Q]; // 新的游戏参数值

        for (int i = 0; i < Q; i++) {
            type[i] = scanner.nextInt();
            s[i] = scanner.nextInt();
            v[i] = scanner.nextInt();
        }

        for (int i = 0; i < Q; i++) {
            if (type[i] == 1) { // 修改X
                X = v[i];
            } else if (type[i] == 2) { // 修改Y
                Y = v[i];
            } else { // 修改A
                A[s[i] - 1] = v[i];
            }
            int result = playGame(N, X, Y, A);
            System.out.println(result);
        }
    }

    private static int playGame(int N, int X, int Y, int[] A) {
        boolean isXTurn = true;
        for (int i = 0; i < N; i++) {
            if (isXTurn) {
                if (Y >= A[i]) {
                    Y -= A[i];
                } else {
                    X += Y;
                    Y = 0;
                }
            } else {
                if (X >= A[i]) {
                    X -= A[i];
                } else {
                    Y += X;
                    X = 0;
                }
            }
            isXTurn = !isXTurn;
        }
        return X;
    }
}