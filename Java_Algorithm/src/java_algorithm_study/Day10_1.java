package java_algorithm_study;

import java.util.Scanner;

public class Day10_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[]= {64,32,16,8,4,2,1};
		int Stick=s.nextInt();
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			if(Stick >=arr[i] ) {
				Stick -=arr[i];
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
