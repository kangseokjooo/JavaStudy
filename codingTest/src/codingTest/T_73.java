package codingTest;

import java.util.*;

public class T_73 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int t=s.nextInt();
		for(int tc=0;tc<t;tc++) {
			String str=s.next();
			int cnt=0;
			if(isP(str)) {
				System.out.println(0);
			}else {
				char ch[]=str.toCharArray();
				boolean flag=false;
				List<Character> list=new ArrayList<Character>();
				for(char c:ch) {
					list.add(c);
				}
				for(int i=0;i<=list.size();i++) {
					List<Character> tmp=new ArrayList<Character>(list);
					
					tmp.add(i,'x');
					StringBuilder sb=new StringBuilder();
					for(char c:tmp) {
						sb.append(c);
					}
					if(isP(sb.toString())) {
						cnt++;
					}
				}
				if(cnt>0) {
					System.out.println(cnt);
				}else {
					System.out.println(-1);
				}
			}
		}
	}
	static boolean isP(String str) {
		String reverse=new StringBuilder(str).reverse().toString();
		
		if(!str.equals(reverse)) {
			return false;
		}
		return true;
	}

}
