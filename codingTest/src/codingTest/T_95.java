package codingTest;

import java.util.*;

public class T_95 {
	static int N;
	static int stats[][];
	static boolean choose[];
	static int answer=Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		N=s.nextInt();
		
		stats=new int[N][N];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				stats[i][j]=s.nextInt();
			}
		}
		choose=new boolean[N];
		
		dfs(0,0);
		System.out.println(answer);
	}
	static void dfs(int idx,int cnt) {
		if(cnt==N/2) {
			difference();
			return;
		}
		if(idx==N) return;
		//start
		choose[idx]=true;
		dfs(idx+1,cnt+1);
		
		//link
		choose[idx]=false;
		dfs(idx+1,cnt);
	}
	static void difference() {
		int sum1=0;
		int sum2=0;
		for(int i=0;i<N;i++) {
			for(int j=i;j<N;j++) {
				if(choose[i] && choose[j] ) {
					sum1+=stats[i][j]+stats[j][i];
				}else if(!choose[i] && !choose[j]) {
					sum2+=stats[i][j]+stats[j][i];
				}
			}
		}
		
		answer=Math.min(answer, Math.abs(sum1-sum2));
	}
	//BOJ S1 스타트와링크 
}
