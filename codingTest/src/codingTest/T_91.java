package codingTest;

import java.util.Scanner;

public class T_91 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int N=s.nextInt();
		
		int arr[]=new int[N];
		
		for(int i=0;i<N;i++) arr[i]=s.nextInt();
		
		int B=s.nextInt();
		int C=s.nextInt();
		long answer=0;
		for(int i=0;i<N;i++) {
			answer++;
			arr[i]-=B;
			if(arr[i]>0) {
				answer+=arr[i]/C;
				if(arr[i]%C!=0) {
					answer++;
				}
			}
		}
		System.out.println(answer);
	}
	
   // 시험감독 B2 
}
