package baiduZhixing;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author htt
 * @Date 2024/6/30
 */


public class T5 {


    public static int minTimeDiff(String s, int[][] edges) {
        int n = s.length();
        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        // 建立图
        for (int[] edge : edges) {
            int u = edge[0] - 1, v = edge[1] - 1;
            graph[u].add(v);
            graph[v].add(u);
        }

        // 找到所有粉色车的位置
        List<Integer> pinkCars = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'P') {
                pinkCars.add(i);
            }
        }

        int minTime = Integer.MAX_VALUE;

        // 遍历找到最优的切割点
        for (int i = 0; i < n - 1; i++) {
            int time = dfs(i, pinkCars, new boolean[n], graph);
            if (time != -1) {
                minTime = Math.min(minTime, time);
            }
        }

        return minTime == Integer.MAX_VALUE ? -1 : minTime;
    }

    private static int dfs(int cutEdge, List<Integer> pinkCars, boolean[] visited, List<Integer>[] graph) {
        int time = 0;
        for (int i = 0; i < pinkCars.size(); i++) {
            visited[pinkCars.get(i)] = true;
            time += Math.abs(pinkCars.get(i) - cutEdge);
        }

        // 检查是否所有粉色车都在同一连通块
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i] && pinkCars.contains(i)) {
                return -1;
            }
        }

        return time;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();
        List<int[]> edges = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            String[] line = scanner.nextLine().split(" ");
            int u = Integer.parseInt(line[0]);
            int v = Integer.parseInt(line[1]);
            edges.add(new int[]{u, v});
        }
        System.out.println(minTimeDiff(s, edges.toArray(new int[0][0])));
    }


}
