package test.tongcheng;

import java.util.*;

public class main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int[][] edges = new int[m][3];
        for (int i = 0; i < m; i++) {
            edges[i][0] = in.nextInt();
            edges[i][1] = in.nextInt();
            edges[i][2] = in.nextInt();
        }
        long res = m1(n,m,k,edges);
        System.out.println(res);
    }


    public static long m1(int n ,int m,int k,int[][] edges){
        Union u = new Union(n);
        List<int[]> vEdges = new ArrayList<>();
        for (int[] edge : edges) {
            int x = edge[0], y = edge[1],v = edge[2];
            if (v <= k){
                u.union(x,y);
            }
            if (v == k) {
                vEdges.add(edge);
            }
        }
        Map<Integer, Integer> comSizeMap = new HashMap<>();
        for (int i = 0; i <= n; i++) {
            int root = u.find(i);
            comSizeMap.put(root,comSizeMap.getOrDefault(root,0)+1);
        }
        long count = 0;
        for(int[] edge : vEdges){
            int x = edge[0],y = edge[1];
            if (u.find(x) == u.find(y)){
                int size = u.getSize(x);
                count += size -1;
            }
        }
        return count;
    }


}

class Union{
    int[] parent;
    int[] size;

    Union(int n){
        parent = new int[n + 1];
        size = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    void union(int x ,int y){
        int rx = find(x);
        int ry = find(y);
        if (rx != ry){
            if (size[rx] >= size[ry]){
                size[rx] += size[ry];
                parent[ry] = rx;
            }else {
                size[ry] += size[rx];
                parent[rx] = ry;
            }
        }
    }

    int find(int z){
        if (parent[z] != z){
            parent[z] = find(parent[z]);
        }
        return parent[z];
    }

    int getSize(int x){
        return size[find(x)];
    }


}
