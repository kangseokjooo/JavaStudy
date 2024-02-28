package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

public class Day16_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		String strArr1[]=new String[N];
		int M=s.nextInt();
		String strArr2[]=new String[M];
		for(int i=0;i<N;i++) {
			strArr1[i]=s.next();
		}
		for(int i=0;i<M;i++) {
			strArr2[i]=s.next();
		}
		int cnt=0;
		Arrays.sort(strArr1);
		for(int i=0;i<M;i++) {
			if(Arrays.binarySearch(strArr1, strArr2[i]) >=0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
