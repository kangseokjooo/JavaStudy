package java_algorithm_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day63_1 {
	static int A,B,N,M;
	static int dist[]=new int[100001];
	static boolean visited[]=new boolean[100001];
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		A=s.nextInt();
		B=s.nextInt();
		N=s.nextInt();
		M=s.nextInt();
		
		System.out.println(bfs());
	}
	static int bfs() {
		Queue<Integer> q=new LinkedList<Integer>();
		q.offer(N);
		visited[N]=true;
		dist[N]=0;
		while(!q.isEmpty()) {
			int cur=q.poll();
			
			if(cur==M) {
				return dist[cur];
			}
			int []moves= {cur+1,cur-1,cur+A,cur-A,cur+B,cur-B,cur*A,cur*B};
			for(int n:moves) {
				if(n>=0&& n<=100000&& !visited[n]) {
					visited[n]=true;
					dist[n]=dist[cur]+1;
					q.offer(n);
				}
			}
		}
		return -1;
	}
}
