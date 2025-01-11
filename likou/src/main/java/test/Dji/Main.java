package test.Dji;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    /* Write Code Here */
    public int numberOfPatrolBlocks(int[][] block) {
        int m = block.length;
        int n = block[0].length;

        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int x = 0, y = 0;
        int directionIndex = 0;
        int patrolCount = 0;

        while (true) {
            if (block[x][y] == 0) {
                block[x][y] = -1;
                patrolCount++;
            }

            int nextX = x + directions[directionIndex][0];
            int nextY = y + directions[directionIndex][1];

            if (nextX < 0 || nextX >= m || nextY < 0 || nextY >= n || block[nextX][nextY] == 1) {
                directionIndex = (directionIndex + 1) % 4;
                nextX = x + directions[directionIndex][0];
                nextY = y + directions[directionIndex][1];
                if (nextX < 0 || nextX >= m || nextY < 0 || nextY >= n || block[nextX][nextY] == 1) {
                    break;
                }
            }

            x = nextX;
            y = nextY;
        }

        return patrolCount;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        int block_rows = 0;
        int block_cols = 0;
        block_rows = in.nextInt();
        block_cols = in.nextInt();

        int[][] block = new int[block_rows][block_cols];
        for (int block_i = 0; block_i < block_rows; block_i++) {
            for (int block_j = 0; block_j < block_cols; block_j++) {
                block[block_i][block_j] = in.nextInt();
            }
        }

        if (in.hasNextLine()) {
            in.nextLine();
        }


        res = new Solution().numberOfPatrolBlocks(block);
        System.out.println(String.valueOf(res));

    }
}
