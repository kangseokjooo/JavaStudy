package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

public class Day4_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//재료의 개수 
		int N=s.nextInt();
		int arr[]=new int[N];
		int hap=s.nextInt();
		int start_idx=0;
		int end_idx=N-1;
		int answer=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		while(start_idx < end_idx) {
			if(arr[start_idx] + arr[end_idx] == hap) {
				start_idx++;
				end_idx --;
				answer++;
			}else if(arr[start_idx] + arr[end_idx] > hap) {
				end_idx--;
			}else {
				start_idx++;
			}
		}
		System.out.println(answer);
	}
	//solved
}
