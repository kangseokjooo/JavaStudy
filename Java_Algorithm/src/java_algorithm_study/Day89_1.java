package java_algorithm_study;

import java.util.Scanner;

public class Day89_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String board=s.nextLine();
		
		StringBuilder sb=new StringBuilder();
		int cnt=0;
		
		for(int i=0;i<board.length();i++) {
			char ch=board.charAt(i);
			if(ch=='X') {
				cnt++;
			}else {
				if(cnt>0) {
					if(cnt%2!=0) {
						System.out.println(-1);
						return;
					}
					int acnt=cnt/4;
					int bcnt=(cnt%4)/2;
					
					for(int j=0;j<acnt;j++) {
						sb.append("AAAA");
					}
					for(int j=0;j<bcnt;j++) {
						sb.append("BB");
					}
					cnt=0;
				}
				sb.append('.');
			}
		}
		if(cnt>0) {
			if(cnt%2!=0) {
				System.out.println(-1);
				return;
			}
			int acnt=cnt/4;
			int bcnt=(cnt%4)/2;
			
			for(int j=0;j<acnt;j++) {
				sb.append("AAAA");
			}
			for(int j=0;j<bcnt;j++) {
				sb.append("BB");
			}
		}
		System.out.println(sb.toString());
	}
//BJ1343
}
