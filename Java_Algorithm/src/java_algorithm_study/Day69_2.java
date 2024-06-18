package java_algorithm_study;

import java.util.Scanner;

public class Day69_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int L=s.nextInt();
		int W=s.nextInt();
		int H=s.nextInt();
		
		double l=0;
		double r=Math.min(Math.min(L, W),H);
		double result=0.0;
		
		while(l+1e-9<r) {
			double m=(l+r)/2.0;
			
			if(Boxes(m,N,L,W,H)) {
				result=m;
				l=m;
			}else {
				r=m;
			}
		}
		System.out.printf("%.9f\n",result);
	}
	public static boolean Boxes(double A,int N,int L,int W,int H) {
		long cntL=(long)(L/A);
		long cntW=(long)(W/A);
		long cntH=(long)(H/A);
		
		long total=cntL*cntW*cntH;
		
		return total >=N;
	}
	//BJ1166
}
