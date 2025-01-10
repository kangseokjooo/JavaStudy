package java_algorithm_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Algorithm_32 {
	static int SIZE=5;
	static int dx[]= {0,0,-1,1};
	static int dy[]= {-1,1,0,0};
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int board[][]=new int[SIZE][SIZE];
		
		for(int i=0;i<SIZE;i++) {
			for(int j=0;j<SIZE;j++) {
				board[i][j]=s.nextInt();
			}
		}
		int sr=s.nextInt();
		int sc=s.nextInt();
		
		int answer=bfs(board,sr,sc);
		
		System.out.println(answer);
	}
	static int bfs(int [][]board,int sr,int sc) {
		boolean visited[][]=new boolean[SIZE][SIZE];
		
		Queue<int[]> q=new LinkedList<int[]>();
		q.add(new int[] {sr,sc,0});
		visited[sr][sc]=true;
		
		while(!q.isEmpty()) {
			int cur[]=q.poll();
			int row=cur[0];
			int col=cur[1];
			int steps=cur[2];
			
			if(board[row][col]==1) {
				return steps;
			}
			for(int i=0;i<4;i++) {
				int nr=row+dx[i];
				int nc=col+dy[i];
				
				if(nr>=0&&nr<SIZE &&nc>=0&&nc<SIZE&&board[nr][nc]!=-1&&!visited[nr][nc]) {
					visited[nr][nc]=true;
					q.add(new int[] {nr,nc,steps+1});
				}
			}
		}
		return -1;
	}
	//BJ25416
}
