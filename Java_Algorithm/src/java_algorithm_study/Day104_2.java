package java_algorithm_study;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Day104_2 {
	static int N;
	static double []pro=new double[4];
	static boolean [][]visited=new boolean[30][30];
	
	static int []dx= {1,-1,0,0};
	static int[] dy= {0,0,1,-1};
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		N=s.nextInt();
		
		for(int i=0;i<4;i++) {
			pro[i]=s.nextInt()/100.0;
		}
		visited[15][15]=true;
		double result=dfs(15,15,0);
		
		DecimalFormat df=new DecimalFormat("0.##########");
		
		System.out.println(df.format(result));
	}
	static double dfs(int x,int y,int step) {
		if(step==N) {
			return 1.0;
		}
		double prob=0.0;
		
		for(int i=0;i<4;i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			
			if(!visited[nx][ny]) {
				visited[nx][ny]=true;
				prob+=pro[i]*dfs(nx,ny,step+1);
				visited[nx][ny]=false;
			}
		}
		return prob;
	}
//BJ1405(X)
}
