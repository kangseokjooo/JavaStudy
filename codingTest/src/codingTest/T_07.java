package codingTest;

import java.util.*;

public class T_07 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int N=s.nextInt();
		int trees[]=new int[N];
		
		for(int i=0;i<N;i++) {
			trees[i]=s.nextInt();
		}
		int diff[]=new int[N-1];
		for(int i=0;i<N-1;i++) {
			diff[i]=trees[i+1]-trees[i];
		}
		
		int g=diff[0];
		for(int i=1;i<diff.length;i++) {
			g=gcd(g,diff[i]);
		}
		
		int total=(trees[N-1]-trees[0])/g+1;
		System.out.println(total-N);
		
	}
	static int gcd(int a, int b) {
		if(b==0) return a;
		return gcd(b,a%b);
	}
	//BOJ S4 가로수  

}
