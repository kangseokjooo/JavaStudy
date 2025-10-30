package codingTest;

import java.util.*;

public class T_19 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] boxes = new int[n];
		
		for (int i = 0; i < boxes.length; i++) {
			boxes[i] = s.nextInt();
		}
		
		int dp[]=new int[n];
		Arrays.fill(dp,1);
		
		int answer = 0;

		for (int i = 0; i < boxes.length; i++) {
			for(int j=0;j<i;j++) {
				if(boxes[j]<boxes[i]) {
					dp[i]=Math.max(dp[i], dp[j]+1);
				}
			}
		}
		for(int i=0;i<n;i++) {
			answer=Math.max(answer,dp[i]);
		}
		
		
		System.out.println(answer);

	}
	//BOJ S2 상자 넣기 

}
