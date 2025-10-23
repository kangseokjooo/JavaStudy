package codingTest;

import java.util.*;

public class T_10 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String word=s.next();
		
		
		String answer=null;
		
		for(int i=1;i<word.length()-1;i++) {
			for(int j=i+1;j<word.length();j++) {
				String a=new StringBuilder(word.substring(0, i)).reverse().toString();
				String b=new StringBuilder(word.substring(i, j)).reverse().toString();
				String c=new StringBuilder(word.substring(j)).reverse().toString();
				
				String str=a+b+c;
				
				if(answer==null || str.compareTo(answer)<0) {
					answer=str;
				}
			}
		}
		System.out.println(answer);
	}
	
	//BOJ S5 단어나누기 

}
