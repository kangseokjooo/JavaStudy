package java_algorithm_study;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Day66_4 {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		s.nextLine();
		
		String sn[]=new String[N];
		
		for(int i=0;i<N;i++) {
			sn[i]=s.nextLine();
		}
		
		Arrays.sort(sn,new Comparator<String>() {
			public int compare(String a, String b) {
				if(a.length()!=b.length()) {
					return a.length()-b.length();
				}
				int sA=digit(a);
				int sB=digit(b);
				if(sA!=sB) {
					return sA-sB;
				}
				return a.compareTo(b);
			}
			private int digit(String str) {
				int sum=0;
				for(char c:str.toCharArray()) {
					if(Character.isDigit(c)) {
						sum+=c-'0';
					}
				}
				return sum;
			}
		});
		for(String ss:sn) {
			System.out.println(ss);
		}
	}

}
