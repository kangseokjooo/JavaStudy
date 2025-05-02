package java_algorithm_study;

import java.util.Scanner;
import java.util.Stack;

public class Algo_15 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String str=s.nextLine();
		
		Stack<Character> st=new Stack<Character>();
		int ans=0;
		
		for(int i=0;i<str.length();i++) {
			char cur=str.charAt(i);
			
			if(cur=='(') {
				st.push(cur);
			}else {
				st.pop();
				
				if(str.charAt(i-1)=='(') {
					ans+=st.size();
				}else {
					ans+=1;
				}
			}
		}
		System.out.println(ans);
	}
	//BJ10799(O)
}
