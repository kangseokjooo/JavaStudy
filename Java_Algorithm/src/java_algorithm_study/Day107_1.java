package java_algorithm_study;

import java.util.Scanner;

public class Day107_1 {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String str=s.nextLine();
		
		int n=str.length();
		
		int acnt=0;
		
		for(int i=0;i<n;i++) {
			if(str.charAt(i)=='a') {
				acnt++;
			}
		}
		String ex=str+str;
		
		int min=Integer.MAX_VALUE;
		
		int curB=0;
		
		for(int i=0;i<acnt;i++) {
			if(ex.charAt(i)=='b') {
				curB++;
			}
		}
		min=curB;
		
		for(int i=1;i<n;i++) {
			if(ex.charAt(i-1)=='b') {
				curB--;
			}
			if(ex.charAt(i+acnt-1)=='b') {
				curB++;
			}
			min=Math.min(min, curB);
		}
		System.out.println(min);
	}
	//BJ1522
}
