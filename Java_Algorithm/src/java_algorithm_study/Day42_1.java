package java_algorithm_study;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day42_1 {
	static ArrayList<Integer> []friend;
	static int [] kevin;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int M=s.nextInt();
		
		friend=new ArrayList[N+1];
		for(int i=1;i<=N;i++) {
			friend[i]=new ArrayList<Integer>();
		}
		for(int i=0;i<M;i++) {
			int a=s.nextInt();
			int b=s.nextInt();
			friend[a].add(b);
			friend[b].add(a);
		}
		kevin=new int[N+1];
		for(int i=1;i<=N;i++) {
			kevin[i]=bfs(i,N);
		}
		int min=Integer.MAX_VALUE;
		int minP=0;
		for(int i=1;i<=N;i++) {
			if(kevin[i]<min) {
				min=kevin[i];
				minP=i;
			}
		}
		System.out.println(minP);
		
	}
	static int bfs(int a,int b) {
		boolean visited[]=new boolean[b+1];
		Queue<Integer> q=new LinkedList<Integer>();
		q.offer(a);
		visited[a]=true;
		int sum=0;
		
		int level=0;
		int curLevel=1;
		int nexLevel=0;
		while(!q.isEmpty()) {
			int current=q.poll();
			curLevel--;
			sum+=level;
			
			for(int n:friend[current]) {
				if(!visited[n]) {
					q.offer(n);
					visited[n]=true;
					nexLevel++;
				}
			}
			if(curLevel ==0) {
				curLevel=nexLevel;
				nexLevel=0;
				level++;
			}
		}
		return sum;
	}
}
