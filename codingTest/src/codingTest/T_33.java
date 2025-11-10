package codingTest;


import java.util.*;

public class T_33 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		
		for(int tc=0;tc<t;tc++) {
			int a=s.nextInt();
			
			int cnt=0;
			
			int min=0;
			int max=(int)Math.pow(10, a)-1;
			
			if(a==1) min=0;
			for(int i=min;i<max+1;i++) {
				String str=String.format("%0"+a+"d",i);
				if(isNumber(str)) {
					cnt++;
				}
			}
			
			System.out.println(cnt);
			
		}
		
		
	}
	static boolean isNumber(String str) {
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)>str.charAt(i+1))return false;
		}
		
		return true;
		
	}
	//BOJ S1 줄어들지 않아 (메모리 초과) 

}
