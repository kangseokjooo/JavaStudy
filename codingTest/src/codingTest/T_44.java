package codingTest;

import java.util.*;

public class T_44 {
	static List<int[]> graph;

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int M=s.nextInt();
		
		graph=new ArrayList<int[]>();
		for(int i=0;i<M;i++) {
			int x=s.nextInt();
			int y=s.nextInt();
			int cost=s.nextInt();
			graph.add(new int[] {x,y,cost});
		}
		
		int start=s.nextInt();
		int end=s.nextInt();
		int min=bfs(N,start,end);
		
		if(min==Integer.MAX_VALUE) {
			System.out.println(0);
		}else {
			System.out.println(min);
		}
	}
	static int bfs(int N,int s,int e) {
		Queue<Integer> q=new LinkedList<>();
		int costs[]=new int[N+1];
		Arrays.fill(costs, Integer.MAX_VALUE);;
		costs[s]=0;
		
		q.offer(s);
		
		while(!q.isEmpty()) {
			int cur=q.poll();
			
			for(int []d:graph) {
				if(d[0]==cur) {
					int nextcity=d[1];
					int cost=d[2];
					
					if(costs[nextcity]>costs[cur]+cost) {
						costs[nextcity]=costs[cur]+cost;
						q.offer(nextcity);
					}
				}
			}
		}
		return costs[e];
	}

}
