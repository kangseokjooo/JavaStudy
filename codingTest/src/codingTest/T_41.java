package codingTest;

import java.util.*;
public class T_41 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String str=s.next();
		char ch[]=str.toCharArray();
		Set<String> answer=new HashSet<String>();
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				String st=str.substring(i, j);
				answer.add(st);
			}
		}
		
		System.out.println(answer.size());
		
	}
	//BOJ S3 서로다른 부분문자열의 개수 

}
