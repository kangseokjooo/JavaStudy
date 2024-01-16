package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

public class Day3_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int dNo=s.nextInt();
		int cnt=0;
		int arr[]=new int[N+1];
		for(int i=1;i<=N;i++) {
			arr[i]=s.nextInt();
		}
		int hapArr[]=new int[N+1];
		for(int i=1;i<=N;i++) {
			hapArr[i]=(hapArr[i-1]+arr[i]);
		}
		int C[]=new int[dNo];
		for(int i=0;i<N;i++) {
			int re=(int)(hapArr[i]%dNo);
			if(re==0) cnt++;
			C[re]++;
		}
		for(int i=0;i<dNo;i++) {
			if(C[i]>1) {
				cnt=cnt+(C[i]*(C[i]-1)/2);
			}
		}
		System.out.println(cnt);
	}
	//solve X (경우의 수 누락)
}
