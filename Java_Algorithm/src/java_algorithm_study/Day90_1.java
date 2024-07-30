package java_algorithm_study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Day90_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int N=s.nextInt();
		
		int votes=s.nextInt();
		
		List<Integer> voteList=new ArrayList<Integer>();
		
		for(int i=1;i<N;i++) {
			voteList.add(s.nextInt());
		}
		
		int result=0;
		
		Collections.sort(voteList,Collections.reverseOrder());
		
		while(!voteList.isEmpty() && voteList.get(0) >= votes) {
			int max=voteList.get(0);
			voteList.set(0, max-1);
			votes++;
			result++;
			
			Collections.sort(voteList,Collections.reverseOrder());
		}
		System.out.println(result);
	}
	//BJ1417
}
