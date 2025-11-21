package codingTest;

import java.util.*;
public class T_75 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int tc=0;tc<t;tc++) {
			String str=s.next();
			
			
			if(isP(str)&& ispartP(str)) {
				System.out.println("#"+(tc+1)+" "+"YES");
			}else {
				System.out.println("#"+(tc+1)+" "+"NO");
			}
		}
	}
	static boolean isP(String str) {
		int l=0, r=str.length()-1;
		while(l<r) {
			if(str.charAt(l)!=str.charAt(r)) return false;
			l++;
			r--;
		}
		return true;
	}
	static boolean ispartP(String str) {
		int n=str.length();
		String p1=str.substring(0,(n-1)/2);
		String p2 = str.substring((n + 1) / 2);
		if(isP(p1) && isP(p2)) {
			return true;
		}
		return false;
		
	}

}
