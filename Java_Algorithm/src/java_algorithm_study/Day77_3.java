package java_algorithm_study;

import java.util.Scanner;

public class Day77_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int M=s.nextInt();
		int lec[]=new int[N];
		
		int sum=0;
		int max=0;
		
		for(int i=0;i<N;i++) {
			lec[i]=s.nextInt();
			sum+=lec[i];
			if(lec[i]>max) {
				max=lec[i];
			}
		}
		int l=max;
		int r=sum;
		int result=sum;
		
		while(l<=r) {
			int m=(l+r)/2;
			if(canD(lec,N,M,m)) {
				result=m;
				r=m-1;
			}else {
				l=m+1;
			}
		}
		System.out.println(result);
	}
	static boolean canD(int lec[],int N,int M,int size) {
		int cnt=1;
		int sum=0;
		
		for(int i=0;i<N;i++) {
			if(sum+lec[i]>size) {
				cnt++;
				sum=lec[i];
				if(cnt>M) {
					return false;
				}
			}else {
				sum+=lec[i];
			}
		}
		return true;
	}
	//BJ2343
}
