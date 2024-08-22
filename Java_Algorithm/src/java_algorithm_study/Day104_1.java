package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

class Task {
	int du;
	int de;

	Task(int du, int de) {
		this.du = du;
		this.de = de;
	}
}

public class Day104_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		
		Task[] task=new Task[n];
		
		for(int i=0;i<n;i++) {
			int d=s.nextInt();
			int t=s.nextInt();
			task[i]=new Task(d, t);
		}
		Arrays.sort(task,(a,b)->b.de-a.de);
		
		int cur=Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++) {
			cur=Math.min(cur, task[i].de);
			cur-=task[i].du;
		}
		System.out.println(cur);

	}
//BJ7983
}
