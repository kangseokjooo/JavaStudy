package codingTest;

import java.util.*;

public class T_15 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int C=s.nextInt();
		int W=s.nextInt();
		
		int []trees=new int[N];
		int max=0;
		for(int i=0;i<N;i++) {
			trees[i]=s.nextInt();
			max=Math.max(max, trees[i]);
		}
		
		long answer=0;
		for(int L=1;L<=max;L++) {
			long total=0;
			for(int tree :trees) {
				if(tree<L) continue;
				int cnt=tree/L;
				int cut=(tree%L==0) ? cnt-1:cnt;
				long profit=(long)cnt*L*W-(long)cut*C;
				if(profit>0) total+=profit;
			}
			answer=Math.max(answer, total);
		}
		System.out.println(answer);
	}
	//BOJ S1 나무꾼 이다솜 

}
