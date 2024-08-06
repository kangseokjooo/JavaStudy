package java_algorithm_study;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Day93_2 {
	static class Node{
		int id;
		int dist;
		Node(int id,int dist){
			this.id=id;
			this.dist=dist;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		List<List<Integer>> graph=new ArrayList<List<Integer>>();
		
		for(int i=0;i<=n;i++) {
			graph.add(new ArrayList<>());
		}
		
		while(true) {
			int a=s.nextInt();
			int b=s.nextInt();
			if(a==-1&&b==-1) {
				break;
			}
			graph.get(a).add(b);
			graph.get(b).add(a);
		}
		int score[]=new int[n+1];
		int min=Integer.MAX_VALUE;
		
		for(int i=1;i<=n;i++) {
			score[i]=bfs(graph,n,i);
			min=Math.min(min, score[i]);
		}
		List<Integer> can=new ArrayList<Integer>();
		for(int i=1;i<=n;i++) {
			if(score[i]==min) {
				can.add(i);
			}
		}
		System.out.println(min+" "+ can.size());
		
		for(int c:can) {
			System.out.print(c+" ");
		}
		
	}
	static int bfs(List<List<Integer>> graph,int n,int start) {
		boolean []visited=new boolean[n+1];
		Queue<Node> q=new LinkedList<>();
		q.add(new Node(start, 0));
		visited[start]=true;
		
		int max=0;
		
		while(!q.isEmpty()) {
			Node node=q.poll();
			int cur=node.id;
			int dist=node.dist;
			
			max=Math.max(max, dist);
			
			
			for(int next:graph.get(cur)) {
				if(!visited[next]) {
					visited[next]=true;
					q.add(new Node(next,dist+1));
				}
			}
		}
		return max;
	}
	//BJ2660
}
