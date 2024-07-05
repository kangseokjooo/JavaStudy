package java_algorithm_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day77_4 {
	static class Point{
		int x,y,moves;
		Point(int x,int y,int moves) {
			this.x=x;
			this.y=y;
			this.moves=moves;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		
		int dx[]= {-2,-1,1,2,2,1,-1,-2};
		int dy[]= {1,2,2,1,-1,-2,-2,-1};
		
		for(int t=0;t<T;t++) {
			int l=s.nextInt();
			int sx=s.nextInt();
			int sy=s.nextInt();
			
			int ex=s.nextInt();
			int ey=s.nextInt();
			
			if(sx==ex&&sy==ey) {
				System.out.println(0);
				continue;
			}
			boolean [][]visited=new boolean[l][l];
			Queue<Point> q=new LinkedList<>();
			q.offer(new Point(sx, sy, 0));
			visited[sx][sy]=true;
			
			int result=-1;
			
			while(!q.isEmpty()) {
				Point p=q.poll();
				
				for(int i=0;i<8;i++) {
					int nx=p.x+dx[i];
					int ny=p.y+dy[i];
					
					if(nx>=0&&nx<l&&ny>=0&&ny<l&&!visited[nx][ny]) {
						if(nx==ex&&ny==ey) {
							result=p.moves+1;
							q.clear();
							break;
						}
						visited[nx][ny]=true;
						q.offer(new Point(nx, ny, p.moves+1));
					}
				}
			}
			System.out.println(result);
		}
	}
	//BJ7562
}
