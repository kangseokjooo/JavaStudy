package java_algorithm_study;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Day16_4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String S=s.nextLine();
		Set<String> part=new HashSet<String>();
		for(int i=0;i<S.length();i++) {
			for(int j=i+1;j<=S.length();j++) {
				part.add(S.substring(i,j));
			}
			
		}
		System.out.println(part.size());
	}

}
