package java_algorithm_study;

import java.util.Scanner;

public class Day32_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int cnt=0;
		for(int i=1;i<=N;i++) {
			if(isHansu(i)) {
				cnt++;
			}
			
		}
		System.out.println(cnt);
	}
	static boolean isHansu(int num) {
		String number=String.valueOf(num);
		int length=number.length();
		if(length ==1 || length==2) {
			return true;
		}
		int diff=number.charAt(1)-number.charAt(0);
		for(int i=1;i<length-1;i++) {
			if(number.charAt(i+1)-number.charAt(i)!=diff) {
				return false;
			}
		}
		return true;
	}
}
