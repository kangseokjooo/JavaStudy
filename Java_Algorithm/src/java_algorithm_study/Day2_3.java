package java_algorithm_study;

import java.util.*;

public class Day2_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int q=s.nextInt();
		int arr[]=new int[N+1];
		long sumArr[]=new long[N+1];
		for(int i=1;i <= N;i++) {
			arr[i]=s.nextInt();
			sumArr[i]=sumArr[i-1]+arr[i];
		}
		//할당 완료 
		for(int i=0;i<q;i++) {
			int x=s.nextInt();
			int y=s.nextInt();
			//구간합 공식
			long partSum=sumArr[y] - sumArr[x-1];
			System.out.println(partSum);
		}
	}
	//배열 index 범위 생각하기
	//solve
}
