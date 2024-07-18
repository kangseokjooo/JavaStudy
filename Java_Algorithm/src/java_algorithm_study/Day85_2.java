package java_algorithm_study;

import java.util.Scanner;

public class Day85_2 {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int X=s.nextInt();
		int Y=s.nextInt();
		int W=s.nextInt();
		int S=s.nextInt();
		
		long minTime=cal(X,Y,W,S);
		
		System.out.println(minTime);
		
	}
	static long cal(int X, int Y,int W,int S) {
		long s=(long)(X+Y)*W;
		long d=Math.min(X, Y)*(long)S+(Math.abs(X-Y))*(long)W;
		long m=(Math.min(X, Y) * (long) S + (Math.abs(X - Y) / 2) * 2 * (long) S + (Math.abs(X - Y) % 2) * (long) W);
		
		return Math.min(s, Math.min(d, m));
	}
	//BJ1459
}
