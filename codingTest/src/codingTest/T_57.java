package codingTest;

import java.util.*;

public class T_57 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int t=s.nextInt();
		for(int tc=0;tc<t;tc++) {
			String str=s.next();
			char ch[]=str.toCharArray();
			
			
				if(isStr(ch)) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
			
		}
	}
	static boolean isStr(char[] arr) {
		int flag[]=new int[10];
		int cnt[]=new int[10];
		
		Arrays.fill(flag, -1);
		
		for(int i=0;i<arr.length;i++) {
			int d=arr[i]-'0';
			cnt[d]++;
			if(cnt[d]==1) {
				flag[d]=i;
			}else if(cnt[d]==2) {
				if(i-flag[d]-1!=d) return false;
			}else {
				return false;
			}
			
		}
		for(int i=0;i<10;i++) {
			if(cnt[i]==1) return false;
		}

		
		return true;
	}
	
}
