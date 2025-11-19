package codingTest;

import java.util.Scanner;

public class T_66 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int tc=0;tc<t;tc++) {
			int P=s.nextInt();
			int Q=s.nextInt();
			int R=s.nextInt();
			int S=s.nextInt();
			//사용리터
			int W=s.nextInt();
			
			int sum=P*W;
			int sum1=0;
			
			if(W<=R) {
				sum1=Q;
			}else {
				sum1=Q+((W-R)*S);
			}
			
			int answer=Math.min(sum, sum1);
					
			System.out.println("#"+(tc+1)+" "+answer);
			
		}
	}
	//SWEA D2 수도 요금 경쟁 

}
