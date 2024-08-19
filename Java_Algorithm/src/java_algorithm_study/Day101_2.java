package java_algorithm_study;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Day101_2 {
	static int []dx= {1,-1,0,0};
	static int []dy= {0,0,1,-1};
	
	static int Offset=500;
	static int Max=1001;
	static int bfs(int x,int y,int ex,int ey,Set<String> p) {
		boolean [][]visited=new boolean[Max][Max];
		
		Queue<int []> q=new LinkedList<int[]>();
		
		q.offer(new int[] {x+Offset,y+Offset,0});
		
		visited[x+Offset][y+Offset]=true;
		
		while(!q.isEmpty()) {
			int []cur=q.poll();
			int cx=cur[0];
			int cy=cur[1];
			int dist=cur[2];
			
			if(cx==ex+Offset&&cy==ey+Offset) {
				return dist;
			}
			for(int i=0;i<4;i++) {
				int nx=cx+dx[i];
				int ny=cy+dy[i];
				
				if(nx>=0&&nx<Max&&ny>=0&&ny<Max&&!visited[nx][ny]) {
					String key=(nx-Offset)+","+(ny-Offset);
					if(!p.contains(key)) {
						visited[nx][ny]=true;
						q.offer(new int[] {nx,ny,dist+1});
					}
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int X=s.nextInt();
		int Y=s.nextInt();
		int N=s.nextInt();
		
		Set<String> p=new HashSet<String>();
		
		for(int i=0;i<N;i++) {
			int A=s.nextInt();
			int B=s.nextInt();
			p.add(A+","+B);
		}
		int result=bfs(0,0,X,Y,p);
		
		System.out.println(result);
		
	}
	//BJ6146
}
