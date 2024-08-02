package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;
	
public class Day92_2 {
	static class Work implements Comparable<Work>{
		int t;
		int d;
		
		public Work(int t,int d) {
			this.t=t;
			this.d=d;
		}
		public int compareTo(Work o) {
			return o.d-this.d;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		Work []work=new Work[n];
		
		for(int i=0;i<n;i++) {
			int T=s.nextInt();
			int S=s.nextInt();
			
			work[i]=new Work(T, S);
		}
		Arrays.sort(work);
		
		int cur=work[0].d-work[0].t;
		
		for(int i=1;i<n;i++) {
			if(cur>work[i].d) {
				cur=work[i].d;
			}
			cur-=work[i].t;
		}
		if(cur<0) {
			System.out.println(-1);
		}else {
			System.out.println(cur);
		}
	}
	//BJ6068
}
