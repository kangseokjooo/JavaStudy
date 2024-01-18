package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

public class Day4_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int arr[]=new int[N];
	
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		for(int k=0;k<N;k++) {
			int f=arr[k];
			int start=0;
			int end=N-1;
			while(start < end) {
				if(arr[start] + arr[end] == f) {
					if(start !=k && end !=k) {
						cnt++;
						break;
					}else if(start == k) {
						start++;
					}else if(end == k) {
						end--;
					}
				}
				else if(arr[start] + arr[end] < f) {
					start++;
				}else {
					end--;
				}
			}
		}
		System.out.println(cnt);
	}

}
