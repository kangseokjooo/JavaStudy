package java_algorithm_study;

import java.util.ArrayList;
import java.util.Scanner;

public class Day108_1 {
    
    static ArrayList<ArrayList<Integer>> tree;
    static int[] parent;
    static boolean[] visited;
    

    static void dfs(int node) {
        visited[node] = true;
        
        for (int c : tree.get(node)) {
            if (!visited[c]) {
                parent[c] = node; 
                dfs(c); 
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int N = s.nextInt();
        

        tree = new ArrayList<>();
        parent = new int[N + 1];
        visited = new boolean[N + 1];
        
        for (int i = 0; i <= N; i++) {
            tree.add(new ArrayList<>());
        }
        

        for (int i = 0; i < N - 1; i++) {
            int u = s.nextInt();
            int v = s.nextInt();
            tree.get(u).add(v);
            tree.get(v).add(u);
        }
        

        dfs(1);
        

        for (int i = 2; i <= N; i++) {
            System.out.println(parent[i]);
        }
        

    }
    //BJ11725
}
