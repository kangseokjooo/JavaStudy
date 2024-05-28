package java_algorithm_study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Day58_2 {
	static int N;
	static List<int []> lecturelist;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		lecturelist=new ArrayList<int[]>();
		
		for(int i=0;i<N;i++) {
			int a=s.nextInt();
			int b=s.nextInt();
			int c=s.nextInt();
			lecturelist.add(new int[] {a,b,c});
		}
		int result=classroom();
		System.out.println(result);
	}
	static int classroom() {
		Collections.sort(lecturelist,(a,b)-> Integer.compare(a[1], b[1]));
		
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		
		for(int []n:lecturelist) {
			int start=n[1];
			int end=n[2];
			
			if(!pq.isEmpty()&& pq.peek() <=start) {
				pq.poll();
			}
			pq.offer(end);
		}
		return pq.size();
	}
}
