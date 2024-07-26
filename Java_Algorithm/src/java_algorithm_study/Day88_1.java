package java_algorithm_study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day88_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int N=s.nextInt();
		int ns=s.nextInt();
		int P=s.nextInt();
		
		List<Integer> scores=new ArrayList<Integer>();
		
		for(int i=0;i<N;i++) {
			scores.add(s.nextInt());
		}
		
		if(N==0) {
			System.out.println(1);
			return;
		}
		if(N==P&&ns<=scores.get(N-1)) {
			System.out.println(-1);
			return;
		}
		int rank=1;
		
		for(int sc:scores) {
			if(ns<sc) {
				rank++;
			}else {
				break;
			}
		}
		System.out.println(rank);
	}
	//BJ1205
}
