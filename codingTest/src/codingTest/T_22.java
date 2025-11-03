package codingTest;

import java.util.*;

public class T_22 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int N=s.nextInt();

		long arr[][]=new long[N+1][3];
		
		//없음 
		arr[1][0]=1;
		//왼쪽 
		arr[1][1]=1;
		//오른쪽 
		arr[1][2]=1;
		
		for(int i=2;i<=N;i++) {
			arr[i][0]=(arr[i-1][0]+arr[i-1][1]+arr[i-1][2])%9901;
			arr[i][1]=(arr[i-1][0]+arr[i-1][2])%9901;
			arr[i][2]=(arr[i-1][0]+arr[i-1][1])%9901;
		}
		
		
		long answer=(arr[N][0]+arr[N][1]+arr[N][2])%9901;
		
		
		System.out.println(answer);
		
		
	}
	
	//BOJ S1 동물원 

}
