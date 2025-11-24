package codingTest;

import java.util.*;
public class T_80 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int N=s.nextInt();
		long M=s.nextLong();
		
		int []trees=new int[N];
		int max=0;
		
		for(int i=0;i<N;i++) {
			trees[i]=s.nextInt();
			if(max<trees[i]) max=trees[i];
		}
		long l=0;
		long r=max;
		long answer=0;
		
		while(l<=r) {
			long m=(l+r)/2;
			
			long sum=0;
			for(int h:trees) {
				if(h>m) sum+=(h-m);
			}
			
			if(sum>=M) {
				answer=m;
				l=m+1;
			}else {
				r=m-1;
			}
		}
		System.out.println(answer);
	}
	//BOJ 나무자르기 S2
}
