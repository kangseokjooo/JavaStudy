package java_algorithm_study;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Day66_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int L=s.nextInt();
		
		int arr[]=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		
		int cnt=0;
		int last=0;
		for(int i=0;i<N;i++) {
			if(arr[i] > last) {
				cnt++;
				last=arr[i]+L-1;
			}
		}
		System.out.println(cnt);
	}

}
