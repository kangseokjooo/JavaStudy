package java_algorithm_study;

import java.util.Scanner;

public class Day23_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int K=s.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=s.nextInt();
		}
		
		int cnt=0;
		for(int i=N-1;i>=0;i--) {
			cnt+=K/arr[i];
			K%=arr[i];
		}
		System.out.println(cnt);
	}

}
