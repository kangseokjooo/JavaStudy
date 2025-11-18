package codingTest;

import java.util.*;

public class T_47 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		double solutions[]=new double[n];
		for(int i=0;i<n;i++) solutions[i]=s.nextDouble();
		Arrays.sort(solutions);
		int answer=0;
		int l=0;
		for(int r=0;r<n;r++) {
			while(solutions[l]<solutions[r]*0.9) {
				l++;
			}
			answer+=r-l;
		}
		System.out.println(answer);
	}
	
	//BOJ S3 표절 (X)

}
