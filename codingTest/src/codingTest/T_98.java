package codingTest;

import java.util.*;
//먼저 뱀은 몸길이를 늘려 머리를 다음칸에 위치시킨다.
//만약 벽이나 자기자신의 몸과 부딪히면 게임이 끝난다.
//만약 이동한 칸에 사과가 있다면, 그 칸에 있던 사과가 없어지고 꼬리는 움직이지 않는다.
//만약 이동한 칸에 사과가 없다면, 몸길이를 줄여서 꼬리가 위치한 칸을 비워준다. 즉, 몸길이는 변하지 않는다.

public class T_98 {

	static class Commands {
		int seconds;
		char dir;

		Commands(int seconds, char dir) {
			this.seconds = seconds;
			this.dir = dir;
		}
	}

	static class Point {
		int x, y;

		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static int N, K;
	static int L;
	static boolean apple[][];
	static Queue<Commands> cmd;
	// 우 하 좌 상
	static int dx[] = { 0, 1, 0, -1 };
	static int dy[] = { 1, 0, -1, 0 };

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		K = s.nextInt();

		apple = new boolean[N + 1][N + 1];

		for (int i = 0; i < K; i++) {
			int x = s.nextInt();
			int y = s.nextInt();
			apple[x][y] = true;
		}
		L = s.nextInt();
		cmd = new LinkedList<>();

		for (int i = 0; i < L; i++) {

			int t = s.nextInt();
			char d = s.next().charAt(0);
			cmd.add(new Commands(t, d));
		}
		int answer = game();
		System.out.println(answer);
	}

	static int game() {
		Queue<Point> snake = new LinkedList<>();
		//뱀의 위치=1
		snake.add(new Point(1, 1));
		//방향 우 하 좌 상  
		int dir=0;
		int time=0;
		
		//머리 위치
		int hx=1,hy=1;
		while(true) {
			time++;
			int nx=hx+dx[dir];
			int ny=hy+dy[dir];
			
			//벽과 충돌 
			if(nx <1 ||ny<1||nx>N||ny>N) return time;
			
			// 몸과 충돌 
			for(Point p:snake) {
				if(p.x==nx && p.y==ny) {
					return time;
				}
			}
			
			snake.add(new Point(nx, ny));
			
			//머리위치 갱신 
			hx=nx;
			hy=ny;
			
			
			//사과 체크/있으면 false로 없으면 꼬리칸 짜르기  
			if(apple[nx][ny]) {
				apple[nx][ny]=false;
			}else {
				snake.poll();
			}
			
			
			
			if(!cmd.isEmpty()&& cmd.peek().seconds==time) {
				Commands c=cmd.poll();
				if(c.dir=='L') {
					//반시계 방향 
					dir=(dir+3)%4;
				}else {
					//시계 방향  
					dir=(dir+1)%4;
				}
			}
		}
	}
	//BOJ 뱀 G4

}
