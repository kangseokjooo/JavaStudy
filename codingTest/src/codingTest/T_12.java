package codingTest;

import java.util.*;

public class T_12 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int L=s.nextInt();
		
		int []D=new int[N];
		int []R=new int[N];
		int []G=new int[N];
		
		for(int i=0;i<N;i++) {
			D[i]=s.nextInt();
			R[i]=s.nextInt();
			G[i]=s.nextInt();
		}
		
		int time=0;
		int pos=0;
		
		for(int i=0;i<N;i++) {
			time+=D[i]-pos;
			pos=D[i];
			
			int cycle=R[i]+G[i];
			int t=time%cycle;
			
			if(t<R[i]) {
				time+=(R[i]-t);
			}
		}
		time+=(L-pos);
		
		System.out.println(time);
		
	}
	//BOJ S4 도로와 신호등 
}
