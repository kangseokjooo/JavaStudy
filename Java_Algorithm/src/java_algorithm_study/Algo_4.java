package java_algorithm_study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Algo_4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int N=s.nextInt();
		int K=s.nextInt();
		
		int []T=new int[N+1];
		for(int i=0;i<N;i++) {
			T[i]=s.nextInt();
			
		}
		T[N]=T[N-1]+1;
		
		List<Integer> gaps=new ArrayList<Integer>();
		
		for(int i=0;i<N-1;i++) {
			int gap=T[i+1]-(T[i]+1);
			if(gap>0) {
				gaps.add(gap);
			}
		}
		Collections.sort(gaps,Collections.reverseOrder());
		
		long total=T[N-1]+1-T[0];
		
		for(int i=0;i<K-1&&i<gaps.size();i++) {
			total-=gaps.get(i);
		}
		System.out.println(total);
	}
	//BJ15553

}
