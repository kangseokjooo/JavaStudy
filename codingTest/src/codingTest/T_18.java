package codingTest;

import java.util.*;

public class T_18 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String m=s.next();
		
		long answer=0;
		
		for(int i=0;i<m.length();i++) {
			int digit=m.charAt(i) - '0';
			if(digit>4) digit--;
			answer=answer*9+digit;
		}
		System.out.println(answer);
		
	}
	//BOJ S4 미터

}
