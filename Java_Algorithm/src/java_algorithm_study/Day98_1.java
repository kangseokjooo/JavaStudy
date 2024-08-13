package java_algorithm_study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Day98_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int N=s.nextInt();
		int []A=new int[N];
		
		for(int i=0;i<N;i++) {
			A[i]=s.nextInt();
		}
		List<int []> idxList=new ArrayList<int[]>();
		
		for(int i=0;i<N;i++) {
			idxList.add(new int [] {A[i],i});
		}
		
		Collections.sort(idxList,(a,b)->a[0]-b[0]);
		
		int []P=new int[N];
		
		for(int i=0;i<N;i++) {
			P[idxList.get(i)[1]]=i;
		}
		for(int i=0;i<N;i++) {
			System.out.print(P[i]+" ");
		}
	}
//BJ1015
}
