package codingTest;

import java.util.Scanner;

public class T_101 {
	static int N,M,H;
	static boolean [][]ladder;
	static int answer=Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		M=s.nextInt();
		H=s.nextInt();
		
		
		ladder=new boolean[H+1][N+1];
		
		for(int i=0;i<M;i++) {
			int a=s.nextInt();
			int b=s.nextInt();
			ladder[a][b]=true;
		}
		if(ch()) {
			System.out.println(0);
			return;
		}
		
		int total=H*(N-1);
		dfs(1,0,total);
		if(answer<=3) System.out.println(answer);
		else {
			System.out.println(-1);
		}
	}
	static boolean ch() {
		for(int start=1;start<=N;start++) {
			int cur=start;
			
			for(int row=1;row<=H;row++) {
				if(cur<=N-1 && ladder[row][cur]) {
					cur=cur+1;
				}else if(cur-1>=1 && ladder[row][cur-1]) {
					cur=cur-1;
				}
			}
			if(cur!=start) return false;
		}
		return true;
	}
	static void dfs(int idx,int cnt,int total) {
		if(cnt>=answer)return;
		
		if(ch()) {
			answer=Math.min(answer, cnt);
			return;
		}
		
		if(cnt==3) return;
		
		for(int i=idx;i<=total;i++) {
			int a=(i-1)/(N-1)+1;
			int b=(i-1)%(N-1)+1;
			
			if(add(a,b)) {
				ladder[a][b]=true;
				dfs(i+1,cnt+1,total);
				ladder[a][b]=false;
			}
		}
	}
	static boolean add(int a,int b) {
		if(ladder[a][b]) return false;
		if(b-1>=1 && ladder[a][b-1])return false;
		if(b+1<=N-1 && ladder[a][b+1]) return false;
		return true;
	}
	//BOJ 사다리 조작 (X) -> 다시 풀어보기 
}
