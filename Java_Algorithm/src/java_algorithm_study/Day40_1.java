package java_algorithm_study;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Day40_1 {
		static int com;
		static int twin;
		static boolean visited[];
		static ArrayList<Integer> []list;
		static int cnt;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		com=s.nextInt();
		twin=s.nextInt();
		
		list=new ArrayList[com+1];
		for(int i=1;i<=com;i++) {
			list[i]=new ArrayList<Integer>();
		}
		for(int i=0;i<twin;i++) {
			int a=s.nextInt();
			int b=s.nextInt();
			list[a].add(b);
			list[b].add(a);
		}
		visited=new boolean[com+1];
		
		dfs(1);
	}
	static void dfs(int start) {
		Stack<Integer> s=new Stack<Integer>();
		s.push(start);
		visited[start]=true;
		
		while(!s.isEmpty()) {
			int current=s.pop();
			cnt++;
			for(int n:list[current]) {
				if(!visited[n]) {
					s.push(n);
					visited[n]=true;
				}
			}
		}
		System.out.println(cnt-1);
	}
}
