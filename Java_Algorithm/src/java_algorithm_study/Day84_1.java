package java_algorithm_study;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Day84_1 {
	static  class Node implements Comparable<Node>{
		int x,y,wall;
		
		Node(int x,int y,int wall) {
			this.x=x;
			this.y=y;
			this.wall=wall;
		}
		public int compareTo(Node o) {
			return this.wall-o.wall;
		}
	}
	static int N, M;
	static int [][]maze;
	static int dist[][];
	static int[] dx= {1,-1,0,0};
	static int[] dy= {0,0,1,-1};
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		M=s.nextInt();
		N=s.nextInt();
		maze=new int[N][M];
		dist=new int[N][M];
		
		for(int i=0;i<N;i++) {
			String line=s.next();
			for(int j=0;j<M;j++) {
				maze[i][j]=line.charAt(j)-'0';
				dist[i][j]=Integer.MAX_VALUE;
			}
		}
		System.out.println(bfs());
	}
	static int bfs() {
		PriorityQueue<Node> pq=new PriorityQueue<>();
		pq.offer(new Node(0,0,0));
		dist[0][0]=0;
		
		while(!pq.isEmpty()) {
			Node cur=pq.poll();
			
			if(cur.x==N-1&&cur.y==M-1) {
				return cur.wall;
			}
			for(int i=0;i<4;i++) {
				int nx=cur.x+dx[i];
				int ny=cur.y+dy[i];
				
				if(nx>=0&&nx<N&&ny>=0&&ny<M) {
					int newWall=cur.wall+maze[nx][ny];
					if(newWall<dist[nx][ny]) {
						dist[nx][ny]=newWall;
						pq.offer(new Node(nx, ny, newWall));
					}
				}
			}
		}
		return -1;
			
	}
	//BJ1261
}
