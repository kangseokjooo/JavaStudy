package java_algorithm_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day56_2 {
	static int F,S,G,U,D;
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		F=s.nextInt();
		S=s.nextInt();
		G=s.nextInt();
		U=s.nextInt();
		D=s.nextInt();
		int result=bfs(S);
		
		if(result==-1) {
			System.out.print("use the stairs");
		}else {
			System.out.println(result);
		}
	}
	static int bfs(int x) {
		boolean visited[]=new boolean[F+1];
		Queue<int []> q=new LinkedList<int[]>();
		q.offer(new int[] {x,0});
		visited[x]=true;
		
		while(!q.isEmpty()) {
			int cur[]=q.poll();
			int floor=cur[0];
			int cnt=cur[1];
			
			if(floor==G) {
				return cnt;
			}
			
			int up=floor+U;
			if(up<=F&&!visited[up]) {
				visited[up]=true;
				q.offer(new int [] {up,cnt+1});
			}
			int down=floor-D;
			if(down>=1&&!visited[down]) {
				visited[down]=true;
				q.offer(new int [] {down,cnt+1});
			}
			
		}
		return -1;
	}
}
