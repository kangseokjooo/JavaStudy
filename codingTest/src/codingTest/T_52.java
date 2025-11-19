package codingTest;

import java.util.*;

public class T_52 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int t=s.nextInt();
		for(int tc=1;tc<=t;tc++) {
			int n=s.nextInt();
			String str=s.next();
			if(n%2!=0) {
				System.out.println("#"+tc+" No");
				continue;
			}
				
			char[] ch=str.toCharArray();
				StringBuilder a1=new StringBuilder();
				StringBuilder a2=new StringBuilder();
				
				for(int i=0;i<n/2;i++) {
					a1.append(ch[i]);
				}
				for(int i=n/2;i<n;i++) {
					a2.append(ch[i]);
				}
				if(a1.toString().equals(a2.toString())) {
					System.out.println("#"+tc+" Yes");
			}else {
				System.out.println("#"+tc+" No");
			}
		}
	}

}
