package codingTest;
import java.util.*;

public class T_21 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		while(true) {
			int N=s.nextInt();
			
			if(N==0) break;
			
			int arr[]=new int[N];
			
			for(int i=0;i<N;i++) arr[i]=s.nextInt();
			
			
			int dp[]=new int[N];
			int answer=arr[0];
			dp[0]=arr[0];
			
			for(int i=1;i<arr.length;i++) {
				dp[i]=Math.max(arr[i],dp[i-1]+arr[i]);
				answer=Math.max(answer, dp[i]);
			}
		
			System.out.println(answer);
			
		}
	}
	
	//BOJ S2 수익 

}
