package java_algorithm_study;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day40_2 {
	static int N;
	static int M;
	static int map[][];
	static boolean visited[][];
	static int dx[]= {-1,1,0,0};
	static int dy[]= {0,0,-1,1};
	static int []currentRobot;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		M=s.nextInt();
		currentRobot=new int[3];
		for(int i=0;i<3;i++) {
			currentRobot[i]=s.nextInt();
		}
		map=new int[N][M];
		visited=new boolean[N][M];
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				map[i][j]=s.nextInt();
				if(map[i][j]==1) {
					visited[i][j]=true;
				}
			}
		}
		int cnt=bfs(currentRobot[0],currentRobot[1],currentRobot[2]);
		
		System.out.println(cnt);
		
	}
	static int bfs(int startX,int startY,int startD) {
		Queue<RobotClean> q=new LinkedList<>();
		q.offer(new RobotClean(startX, startY, startD));
		visited[startX][startY]=true;
		int cleancnt=1;
		while(!q.isEmpty()) {
			RobotClean r=q.poll();
			boolean canM=false;
			
			for(int i=0;i<4;i++) {
				int nx=r.x+ dx[i];
				int ny=r.y+dy[i];
				if(nx >= 0 && nx < N && ny >= 0 && ny < M && !visited[nx][ny]) {
				    canM = true;
				    visited[nx][ny] = true;
				    cleancnt++;
				    q.offer(new RobotClean(nx, ny, i));
				    break;
				}
				
			}
			if(!canM) {
				int nx=r.x-dx[r.directions];
				int ny=r.y-dy[r.directions];
				
				if(nx>=0&& nx<N&& ny>=0&&ny<M&&!visited[nx][ny]) {
					q.offer(new RobotClean(nx, ny, r.directions));
					
				}
			}
		}
		return cleancnt;
	}
	static class RobotClean{
		int x;
		int y;
		int directions;
		public RobotClean(int x,int y,int directions) {
			this.x=x;
			this.y=y;
			this.directions=directions;
		}
	}
}
