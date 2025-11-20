package codingTest;

import java.util.*;

public class T_69 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		
		for(int tc=0;tc<t;tc++) {
			int N=s.nextInt();
			int TA[]=new int[N];
			int TB[]=new int[N];
			
			for(int i=0;i<N;i++) TA[i]=s.nextInt();
			for(int i=0;i<N;i++) TB[i]=s.nextInt();
			//A팀인지 아닌지 
			boolean flag[]=new boolean[N];
			//지명이 된건지 아닌
			boolean used[]=new boolean[N];
			
			int idxA=0,idxB=0;
			
			for(int turn=0;turn<N;turn++) {
				//지명이 됐냐? 그럼 인덱스 증가 
				if(turn %2==0) {
					
					while(used[TA[idxA]-1]) idxA++;
					int p=TA[idxA]-1;
					used[p]=true;
					flag[p]=true;
				}else {
					while(used[TB[idxB]-1]) idxB++;
					int p=TB[idxB]-1;
					used[p]=true;
					flag[p]=false;
				}
			}
			
			StringBuilder answer=new StringBuilder();
			
			for(boolean b:flag) {
				if(b) answer.append('A');
				else answer.append("B");
			}
			System.out.println(answer.toString());
		}
	}
	//SWEA 지명 선수 D3 

}
