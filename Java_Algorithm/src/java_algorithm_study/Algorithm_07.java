package java_algorithm_study;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Algorithm_07 {
	static ArrayList<Integer> []graph;
	static int  N;
	static int twin;
	static boolean visited[];
	static int cnt=0;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		N=s.nextInt();
		twin=s.nextInt();
		
		graph=new ArrayList[N+1];
		visited=new boolean[N+1];
		
		for(int i=1;i<=N;i++) {
			graph[i]=new ArrayList<Integer>();
		}
		
		for(int i=0;i<twin;i++) {
			int a=s.nextInt();
			int b=s.nextInt();
			graph[a].add(b);
			graph[b].add(a);
		}
		
		bfs(1);
		System.out.println(cnt-1);
		
//		 for (int i = 1; i <= N; i++) {
//	            System.out.println(graph[i]);
//	        }
		
	}
	static void bfs(int start) {
		Queue<Integer> q=new LinkedList<Integer>();
		q.offer(start);
		visited[start]=true;
		
		while(!q.isEmpty()) {
			int cur=q.poll();
			
			cnt++;
			for(int n:graph[cur]) {
				if(!visited[n]) {
					q.offer(n);
					visited[n]=true;
				}
			}
		}
	}
	

}
