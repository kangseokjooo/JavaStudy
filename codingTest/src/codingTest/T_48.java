package codingTest;

import java.util.*;

public class T_48 {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		String words[]=new String[n];
		for(int i=0;i<words.length;i++) words[i]=s.next();
		
		int answer=0;
		for(int i=0;i<1;i++) {
			for(int j=i+1;j<n;j++) {
				if(isSimilar(words[i],words[j])) {
					answer++;
				}
			}
		}
		System.out.println(answer);
	}
	static boolean isSimilar(String str1,String str2) {
		int []F1=new int[26];
		int []F2=new int[26];
		for(char c:str1.toCharArray()) F1[c-'A']++;
		for(char c:str2.toCharArray()) F2[c-'A']++;
		System.out.println(Arrays.toString(F1));
		System.out.println(Arrays.toString(F2));
		
		int diff=0;
		for(int i=0;i<26;i++) {
			diff+=Math.abs(F1[i]-F2[i]);
		}
		if(str1.length()==str2.length()) {
			return diff<=2;
		}else if(Math.abs(str1.length()-str2.length())==1) {
			return diff==1;
		}else {
			return false;
		}
		
	}
	//BOJ S2 비슷한단어 
}
