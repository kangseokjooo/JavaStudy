package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

public class Day75_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int N=s.nextInt();
		
		int A=s.nextInt();
		int B=s.nextInt();
		
		int C=s.nextInt();
		
		int top[]=new int[N];
		
		for(int i=0;i<N;i++) {
			top[i]=s.nextInt();
		}
		
		Arrays.sort(top);
		for(int i=0;i<N/2;i++) {
			int tmp=top[i];
			top[i]=top[N-1-i];
			top[N-1-i]=tmp;
		}
		int maxCal=C/A;
		int curCal=C;
		int curP=A;
		
		for(int i=0;i<N;i++) {
			curCal+=top[i];
			curP+=B;
			int cal=curCal/curP;
			if(cal>maxCal) {
				maxCal=cal;
			}
		}
		System.out.println(maxCal);
	}

}
