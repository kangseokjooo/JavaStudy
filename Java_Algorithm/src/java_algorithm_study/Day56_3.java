package java_algorithm_study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Day56_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		for(int t=0;t<T;t++) {
			int N=s.nextInt();
			List<int []> list=new ArrayList<int[]>();
			for(int i=0;i<N;i++) {
				list.add(new int [] {s.nextInt(),s.nextInt()});
			}
			
			Collections.sort(list,Comparator.comparingInt(o->o[0]));
			
			int cnt=0;
			
			int min=Integer.MAX_VALUE;
			
			for(int [] person:list) {
				if(person[1]<min) {
					cnt++;
					min=person[1];
				}
			}
			System.out.println(cnt);
		}
	}

}
