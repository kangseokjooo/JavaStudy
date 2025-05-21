package java_algorithm_study;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Algo_38 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int N=s.nextInt();
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>((a,b)->{
			int A = Math.abs(a);
            int B = Math.abs(b);
            if (A == B) return a - b;
            return A - B;
				
		});
		
		for(int i=0;i<N;i++) {
			int x=s.nextInt();
			if(x==0) {
			if(pq.isEmpty()) {
				System.out.println(0);
			}else {
				System.out.println(pq.poll());
			}
		}else {
			pq.offer(x);
		}
		}
	}
	//BJ11286
}
