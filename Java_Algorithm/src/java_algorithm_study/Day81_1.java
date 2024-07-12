package java_algorithm_study;

import java.util.Scanner;

public class Day81_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int dist[]=new int [n];
		for(int i=0;i<n;i++) {
			dist[i]=s.nextInt();
		}
		
		int start=s.nextInt()-1;
		boolean []visited=new boolean[n];
		
		int result=dfs(start,dist,visited);
		
		System.out.println(result);
	}
	static int dfs(int cur,int []dist,boolean []visited) {
		if(cur<0 || cur>=dist.length || visited[cur]) {
			return 0;
		}
		visited[cur]=true;
		
		int cnt=1;
		
		cnt+=dfs(cur-dist[cur],dist,visited);
		cnt+=dfs(cur+dist[cur],dist,visited);
		
		return cnt;
	}
	//BJ14248
}
