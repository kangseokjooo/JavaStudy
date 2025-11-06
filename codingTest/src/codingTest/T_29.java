package codingTest;

import java.util.*;

public class T_29 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int N=s.nextInt();
		int M=s.nextInt();
		int arr[]=new int[N];
		
		for(int i=0;i<arr.length;i++) arr[i]=s.nextInt();
		
		int answer=0;
		
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum+=arr[j];
				if(sum==M) {
					answer++;
				}
				
			}
		}
		System.out.println(answer);
	}
	//BOJ S4 수들의 합 
}
