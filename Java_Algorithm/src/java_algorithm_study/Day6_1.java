package java_algorithm_study;

import java.util.*;

public class Day6_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int L=s.nextInt();
		
		Deque<int []> q=new ArrayDeque<int[]>();
		for(int i=0;i<N;i++) {
			int n=s.nextInt();
			while(!q.isEmpty() && q.peekLast()[0] > n)q.pollLast();
			q.offer(new int[] {n,i});
			if(q.peek()[1] < i -(L-1)) {
				q.poll();
			}
			System.out.print(q.peek()[0]+" ");
		}
	}
	//시간초과 BufferedReader

}
