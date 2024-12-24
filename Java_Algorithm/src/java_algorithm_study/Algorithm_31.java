package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

public class Algorithm_31 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int T=s.nextInt();
		
		while(T-- >0) {
			int N=s.nextInt();
			int []h=new int[N];
			
			for(int i=0;i<N;i++) {
				h[i]=s.nextInt();
			}
			Arrays.sort(h);
			
			int []arrange=new int[N];
			int l=0,r=N-1;
			
			for(int i=0;i<N;i++) {
				if(i%2==0) {
					arrange[l++]=h[i];
				}else {
					arrange[r--]=h[i];
				}
			}
			int max=0;
			for(int i=0;i<N;i++) {
				int diff=Math.abs(arrange[i]-arrange[(i+1)%N]);
				max=Math.max(max, diff);
			}
			System.out.println(max);
		}
	}
//BJ11497
}
