package java_algorithm_study;

import java.util.Scanner;

public class Algo_6 {
	static int N;
	static int [][]arr;
	static int min=Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		arr=new int[N][2];
		for(int i=0;i<N;i++) {
			arr[i][0]=s.nextInt();
			arr[i][1]=s.nextInt();
		}
		
		dfs(0,1,0,0);
		
		System.out.println(min);
		
	}
	static void dfs(int idx,int s, int b,int cnt) {
		if(idx==N) {
			if(cnt>0) {
				min=Math.min(min, Math.abs(s-b));
			}
			return;
		}
		dfs(idx+1,s*arr[idx][0],b+arr[idx][1],cnt+1);
		
		dfs(idx+1,s,b,cnt);
	}
	//BJ2911
}
