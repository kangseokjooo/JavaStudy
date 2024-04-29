package java_algorithm_study;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day50_1 {
	static ArrayList<ArrayList<Integer>> graph;
	static boolean visited[];
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int N=s.nextInt();
		int M=s.nextInt();
		
		graph=new ArrayList<ArrayList<Integer>>(N+1);
		for(int i=0;i<=N;i++) {
			graph.add(new ArrayList<>());
		}
		for(int i=0;i<M;i++) {
			int x=s.nextInt();
			int y=s.nextInt();
			graph.get(x).add(y);
			graph.get(y).add(x);
		}
		visited=new boolean[N+1];
		int cnt=0;
		for(int i=1;i<=N;i++) {
			if(!visited[i]) {
				bfs(i);
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	static void bfs(int s) {
		Queue<Integer> q=new LinkedList<Integer>();
		q.offer(s);
		visited[s]=true;
		while(!q.isEmpty()) {
			int cur=q.poll();
			for(int n:graph.get(cur)) {
				if(!visited[n]) {
					q.offer(n);
					visited[n]=true;
				}
			}
		}
	}
}
