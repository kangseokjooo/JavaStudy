package codingTest;

import java.util.*;

public class T_08 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int M=s.nextInt();
		
		String []words=new String[N];
		int curtotal=0;
		for(int i=0;i<N;i++) {
			words[i]=s.next();
			curtotal+=words[i].length();
		}
		int underLine=M-curtotal;
		int g=N-1;
		
		int base=underLine/g;
		
		int extra=underLine%g;
		
		
		
		StringBuilder answer=new StringBuilder();
		
		for(int i=0;i<N;i++) {
			answer.append(words[i]);
			if(i<g) {
				int x=base+((i>=g-extra)? 1:0);
				for(int j=0;j<x;j++) {
					answer.append('_');
				}
			}
		}
		System.out.println(answer.toString());
		
		
	}
	
	//BOJ S1 밑 줄 

}
