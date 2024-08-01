package java_algorithm_study;

import java.util.Scanner;
import java.util.Stack;

public class Day91_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int N=s.nextInt();
		int P=s.nextInt();
		
		Stack<Integer>[] guitar=new Stack[7];
		
		for(int i=1;i<=6;i++) {
			guitar[i]=new Stack<Integer>();
		}
		
		int moves=0;
		
		for(int i=0;i<N;i++) {
			int snum=s.nextInt();
			int fnum=s.nextInt();
			
			Stack<Integer> st=guitar[snum];
			
			while(!st.isEmpty() && st.peek()>fnum) {
				st.pop();
				moves++;
			}
			if(st.isEmpty() || st.peek()!=fnum) {
				st.push(fnum);
				moves++;
			}
		}
		System.out.println(moves);
	}
	//BJ2841
}
