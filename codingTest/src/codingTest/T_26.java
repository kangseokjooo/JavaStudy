package codingTest;

import java.util.*;

public class T_26 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int tc=1;
		while(true) {
			String str=s.next();
			
			if(str.matches("[-]+")) break;
			
			char ch[]=str.toCharArray();
			
			int open=0;
			int count=0;
			
			for(char c:ch) {
				if(c=='{') {
					open++;
				}else { 
					if(open==0) { 
						open++;
						count++;
					}else { 
						open--;
					}
				}
			}
		
			count+=open/2;
			System.out.println(tc+". "+count);
			tc++;
		}
	}
	//BOJ S1 안정적인 문자열

}
