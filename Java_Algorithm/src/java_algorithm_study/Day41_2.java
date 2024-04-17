package java_algorithm_study;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day41_2 {
		static ArrayList<int []> []tree;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int M=s.nextInt();
		
		tree=new ArrayList[N+1];
		for(int i=1;i<=N;i++) {
			tree[i]=new ArrayList<int[]>();
		}
		
		for(int i=0;i<N-1;i++) {
			int n1=s.nextInt();
			int n2=s.nextInt();
			int dis=s.nextInt();
			tree[n1].add(new int[] {n2,dis});
			tree[n2].add(new int[] {n1,dis});
		}
		for(int i=0;i<M;i++) {
			int start=s.nextInt();
			int end=s.nextInt();
			int distance=bfs(start,end);
			System.out.println(distance);
		}
	}
	static int bfs(int s,int e) {
		Queue<int []> q=new LinkedList<int[]>();
		boolean visited[]=new boolean[tree.length];
		
		q.offer(new int[] {s,0});
		visited[s]=true;
		
		while(!q.isEmpty()) {
			int cur[]=q.poll();
			int curnode=cur[0];
			int curdistance=cur[1];
			
			if(curnode==e) {
				return curdistance;
			}
			for(int []n:tree[curnode]) {
				int Nnode=n[0];
				int Ndistance=n[1];
				
				if(!visited[Nnode]) {
					visited[Nnode]=true;
					q.offer(new int[] {Nnode,curdistance+Ndistance});
				}
			}
		}
		return -1;
	}

}
