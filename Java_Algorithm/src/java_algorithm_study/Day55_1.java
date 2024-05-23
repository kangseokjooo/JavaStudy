package java_algorithm_study;

import java.util.Scanner;

public class Day55_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=s.nextInt();
		}
		
		int result[]=lineFunc(arr,N);
		
		for(int n:result) {
			System.out.print(n+" ");
		}
	}
	static int[] lineFunc(int x[],int N) {
		int result[]=new int[N];
		boolean su[]=new boolean[N];
		
		for(int i=0;i<N;i++) {
			int cnt=x[i];
			for(int j=0;j<N;j++) {
				if(!su[j]) {
					if(cnt==0) {
						result[j]=i+1;
						su[j]=true;
						break;
					}else {
						cnt--;
					}
				}
			}
		}
		return result;
	}
}
