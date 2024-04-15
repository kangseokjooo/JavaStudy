package java_algorithm_study;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day39_2 {
		static int N;
		static ArrayList<Integer> []relation;
		static boolean []visited;
		static int []depth;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		N=s.nextInt();
		int t1=s.nextInt();
		int t2=s.nextInt();
		
		relation=new ArrayList[N+1];
		for(int i=1;i<=N;i++) {
			relation[i]=new ArrayList<Integer>();
		}
		visited=new boolean[N+1];
		depth=new int[N+1];
		
		int M=s.nextInt();
		for(int i=0;i<M;i++) {
			int p=s.nextInt();
			int c=s.nextInt();
			relation[p].add(c);
			relation[c].add(p);
		}
		int answer=bfs(t1,t2);
		System.out.println(answer);
		
	}
	static int bfs(int start,int end) {
		Queue<Integer> q=new LinkedList<Integer>();
		q.offer(start);
		visited[start]=true;
		
		while(!q.isEmpty()) {
			int current=q.poll();
			for(int next:relation[current]) {
				if(!visited[next]) {
					visited[next]=true;
					depth[next]=depth[current]+1;
					q.offer(next);
					if(next==end) {
						return depth[next];
					}
				}
			}
		}
		return -1;
	}
}
