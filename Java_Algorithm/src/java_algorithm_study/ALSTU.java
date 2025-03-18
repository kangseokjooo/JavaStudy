package java_algorithm_study;

import java.util.Scanner;

public class ALSTU {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		while(true) {
			String input=s.next();
			if(input.equals("R0C0")) break;
			
			String p[]=input.substring(1).split("C");
			
			int R=Integer.parseInt(p[0]);
			int C=Integer.parseInt(p[1]);
			
			
			System.out.println(change(C)+R);
		}
	}
	static String change(int col) {
		StringBuilder sb=new StringBuilder();
		
		while(col>0) {
			col--;
			sb.insert(0, (char)('A'+col%26));
			col/=26;
		}
		return sb.toString();
	}
	//BJ2757
}
