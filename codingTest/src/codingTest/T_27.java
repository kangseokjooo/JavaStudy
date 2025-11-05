package codingTest;

import java.util.*;

public class T_27 {
	static double combination(int n,int r) {
		if(r>n) return 0;
		double res=1;
		for(int i=0;i<r;i++) {
			res*=(n-i);
			res/=(i+1);
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int N=s.nextInt();
		int M=s.nextInt();
		int K=s.nextInt();
		
		double total=combination(N, M);
		double win=0;
		
		for(int i=K;i<=M;i++) {
			win+=combination(M, i)*combination(N-M, M-i);
		}
		
		System.out.println(win/total);
	}
	//BOJ S4 복권 

}
