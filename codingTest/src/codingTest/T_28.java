package codingTest;

import java.util.*;

public class T_28 {
	static int N;
	static int[] arr;
	static int S;
	static int cnt=0;

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		 N=s.nextInt();
		 S=s.nextInt();
		 arr=new int[N];
		for(int i=0;i<arr.length;i++) arr[i]=s.nextInt();
		
		
		dfs(0,0);
		
		//아무것도 고르지 못했을때의 집합 빼주기 
		if(S==0) cnt--;
		
		System.out.println(cnt);
		

	}
	static void dfs(int idx,int sum) {
		if(idx==N) {	
		if(sum==S) cnt++;
		return;
		}
		//현재 원소 포함 
		dfs(idx+1,sum+arr[idx]);
		//미포함 
		dfs(idx+1,sum);
	}
	//BOJ S2 부분수열의 합 
	
}
