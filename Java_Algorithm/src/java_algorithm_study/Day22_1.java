package java_algorithm_study;

import java.util.Scanner;
import java.util.Stack;

public class Day22_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int A[]=new int[N];
		for(int i=0;i<N;i++) {
			A[i]=s.nextInt();
		}
		Stack<Integer> stack=new Stack<Integer>();
		StringBuilder sb=new StringBuilder();
		int num=1;
		boolean result=true;
		for(int i=0;i<A.length;i++) {
			int S=A[i];
			if(S >=num) {
				while(S >=num) {
					stack.push(num++);
					sb.append("+\n");
				}
				stack.pop();
				sb.append("-\n");
			}
			else {
				int n=stack.pop();
				if(n > S) {
					System.out.println("NO");
					result=false;
					break;
				}
				else {
					sb.append("-\n");
				}
			}
		}
		if(result) {
			System.out.println(sb.toString());
		}
	}

}
