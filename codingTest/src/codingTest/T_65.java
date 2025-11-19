package codingTest;

import java.util.*;

public class T_65 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int tc=0;tc<t;tc++) {
			int A=s.nextInt();
			int B=s.nextInt();
			
			int arrA[]=new int[A];
			int arrB[]=new int[B];
			
			for(int i=0;i<A;i++) arrA[i]=s.nextInt();
			for(int i=0;i<B;i++) arrB[i]=s.nextInt();
			
			int max=Integer.MIN_VALUE;
			if(A<=B) {
				for(int i=0;i<=B-A;i++) {
					int sum=0;
					for(int j=0;j<A;j++) {
						sum+=arrA[j]*arrB[i+j];
					}
					max=Math.max(max, sum);
				}
				
				
			}else {
				for(int i=0;i<=A-B;i++) {
					int sum=0;
					for(int j=0;j<B;j++) {
						sum+=arrB[j]*arrA[i+j];
					}
					max=Math.max(max, sum);
				}
			}
			System.out.println("#"+(tc+1)+" "+max);
		}

	}
	//SWEA D2 두개의 숫자열 

}
