package java_algorithm_study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day38_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int N=s.nextInt();
		
		List<Integer> list=new ArrayList<Integer>();
		
		for(int i=0;i<N;i++) {
			list.add(s.nextInt());
		}
		int S=s.nextInt();
		
		int mcnt=0;
		int cIdx=0;
		
		while(cIdx < N-1 && mcnt < S) {
			int max=list.get(cIdx), maxIdx=-1;
			
			int idx=cIdx+1, cnt=1;
			while(mcnt+cnt<=S && idx<N) {
				int num=list.get(idx);
				if(num > max) {
					max=num;
					maxIdx=idx;
				}
				cnt++;
				idx++;
			}
			if(maxIdx !=-1) {
				list.remove(maxIdx);
				list.add(cIdx,max);
				mcnt+=maxIdx-cIdx;
			}
			cIdx++;
		}
		StringBuilder sb=new StringBuilder();
		for(int i:list) {
			sb.append(i).append(" ");
		}
		System.out.println(sb);
	}

}
