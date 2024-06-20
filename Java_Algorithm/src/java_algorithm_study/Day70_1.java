package java_algorithm_study;

import java.util.Scanner;

public class Day70_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int X=s.nextInt();
		int Y=s.nextInt();
		
		int cur=(int)((long)Y*100/X);
		
		if(cur>=99) {
			System.out.println(-1);
			return;
		}
		
		int l=1;
		int r=1000000000;
		int result=-1;
		
		while(l<=r) {
			int m=l+(r-l)/2;
			int newper=(int)((long)(Y+m)*100/(X+m));
			
			if(newper > cur) {
				result=m;
				r=m-1;
			}else {
				l=m+1;
			}
		}
		System.out.println(result);
	}

}
