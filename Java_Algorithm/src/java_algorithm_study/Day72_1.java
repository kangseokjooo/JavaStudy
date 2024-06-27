package java_algorithm_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day72_1 {
	static class Pos{
		int idx,jumps;
		Pos(int idx,int jumps){
			this.idx=idx;
			this.jumps=jumps;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int A[]=new int[N];
		
		for(int i=0;i<N;i++) {
			A[i]=s.nextInt();
		}
		int result=bfs(A,N);
		System.out.println(result);
		
	}
	public static int bfs(int []A,int N) {
		Queue<Pos> q=new LinkedList<>();
		boolean visited[]=new boolean[N];
		q.offer(new Pos(0,0));
		visited[0]=true;
		
		while(!q.isEmpty()) {
			Pos cur=q.poll();
			
			if(cur.idx==N-1) {
				return cur.jumps;
			}
			for(int i=1;i<=A[cur.idx];i++) {
				int nIdx=cur.idx+i;
				if(nIdx<N && !visited[nIdx]) {
					q.offer(new Pos(nIdx,cur.jumps+1));
					visited[nIdx]=true;
				}
			}
		}
		return -1;
	}
	//BJ11060
}
