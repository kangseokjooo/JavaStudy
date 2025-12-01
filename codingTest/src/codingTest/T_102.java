package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class T_102 {
	static int N;
	//x증가 ->y감소-> x감소,->y증가  
	static int dx[]= {1,0,-1,0};
	static int dy[] ={0,-1,0,1};
	//0이상 100이하 
	static boolean map[][]=new boolean[101][101];
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int N=s.nextInt();
		
		
		for(int i=0;i<N;i++) {
			int x=s.nextInt();
			int y=s.nextInt();
			int d=s.nextInt();
			int g=s.nextInt();
			
			dragonCurve(x,y,d,g);
		}
		
		int answer=Possible();
		System.out.println(answer);

	}
	static void dragonCurve(int x,int y,int d,int g) {
		List<Integer> dir=new ArrayList<Integer>();
		dir.add(d);
		
		for(int i=0;i<g;i++) {
			for(int j=dir.size()-1;j>=0;j--) {
				dir.add((dir.get(j)+1)%4);
			}
		}
		map[y][x]=true;
		
		for(int di:dir) {
			x+=dx[di];
			y+=dy[di];
			map[y][x]=true;
		}
		
	}
	
	static int Possible() {
		int cnt=0;
		for(int y=0;y<100;y++) {
			for(int x=0;x<100;x++) {
				if(map[y][x]&&map[y+1][x]&&map[y][x+1]&&map[y+1][x+1]) {
					cnt++;
				}
			}
		}
		return cnt;
	}
	//BOJ 드래곤커브 G3 

}
