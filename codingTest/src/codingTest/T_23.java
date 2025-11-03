package codingTest;

import java.util.*;
public class T_23 {
	static int N,K;
	static List<List<Integer>> list=new ArrayList<List<Integer>>();

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		 N=s.nextInt();
		 K=s.nextInt();
		
		 back(0,0,new ArrayList<>());
		 
		 int answer=Integer.MIN_VALUE;
		 for(List<Integer> n:list) {
			 int p=1;
			 for(int num :n) {
				 p*=num;
			 }
			 answer=Math.max(answer, p);
		 }
		 
		 System.out.println(answer);
		
		
	}
	
	static void back(int sum,int d,List<Integer> path) {
		if(sum>N) return;
		
		if(d==K) {
			if(sum==N) {
				list.add(new ArrayList<Integer>(path));
			}
			return;
		}
		for(int i=0;i<=N;i++) {
			path.add(i);
			back(sum+i,d+1,path);
			path.remove(path.size()-1);
				
			
		}
	}
	
	//BOJ S2 최대 곱 

}
