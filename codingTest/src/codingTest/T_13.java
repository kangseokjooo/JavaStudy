package codingTest;

import java.util.*;
public class T_13 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) arr[i]=s.nextInt();
		
		Arrays.sort(arr);
		int min=Integer.MAX_VALUE;
		int answer=0;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=0;j<n;j++) {
				sum+=Math.abs(arr[i]-arr[j]);
			}
			if(sum<min || (sum==min && arr[i]<answer)) {
				min=sum;
				answer=arr[i];
			}
		}
		System.out.println(answer);
	}
	//BOJ S3 대표 자연수 

}
