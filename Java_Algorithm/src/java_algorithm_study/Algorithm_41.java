package java_algorithm_study;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Algorithm_41 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		while(s.hasNext()) {
			int N=s.nextInt();
			int M=s.nextInt();
			int cnt=0;
			for(int i=N;i<=M;i++) {
				if(isNumber(i)) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
	static boolean isNumber(int num) {
		String str=Integer.toString(num);
		Set<Character> set=new HashSet<Character>();
		
		for(char c:str.toCharArray()) {
			if(set.contains(c)) {
				return false;
			}
			set.add(c);
		}
		return true;
	}
	//BJ5671
}
