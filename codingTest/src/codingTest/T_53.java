package codingTest;

import java.util.*;

public class T_53 {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int t=s.nextInt();
		
		
		for(int tc=1;tc<=t;tc++) {
			String str=s.next();
			Set<Character> set=new HashSet<Character>();
			
			char []ch=str.toCharArray();;
			for(int i=0;i<ch.length;i++) {
				if(!set.add(ch[i])) {
					set.remove(ch[i]);
				}
			}
			List<Character> list=new ArrayList<Character>(set);
			if(list.isEmpty()) {
				System.out.println("#"+tc+" Good");
			}else {
				StringBuilder answer=new StringBuilder();
				Collections.sort(list);;
				for(char c:list) {
					answer.append(c);
				}
				System.out.println("#"+tc+" "+answer.toString());
			}
		}
	}
	

}
