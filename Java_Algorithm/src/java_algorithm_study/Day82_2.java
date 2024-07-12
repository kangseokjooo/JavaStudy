package java_algorithm_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day82_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int N=s.nextInt();
		int K=s.nextInt();
		
		Queue<Integer> q=new LinkedList<Integer>();
		
		for(int i=1;i<=N;i++) {
			q.offer(i);
		}
		StringBuilder sb=new StringBuilder();
		sb.append("<");
		
		while(!q.isEmpty()) {
			for(int i=0;i<K-1;i++) {
				q.offer(q.poll());
			}
			sb.append(q.poll());
			if(!q.isEmpty()) {
				sb.append(", ");
			}
		}
		sb.append(">");
		System.out.println(sb.toString());
	}
	//BJ1158
}
