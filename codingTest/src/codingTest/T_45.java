package codingTest;

import java.util.*;

public class T_45 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String words[]=new String[n];
		
		for(int i=0;i<n;i++) words[i]=s.next();
		
		List<String> wList=Arrays.asList(words);
		
		wList.sort((a,b)->{
			if(a.length()!=b.length()) return a.length()-b.length();
			
			int sumA=convert(a);
			int sumB=convert(b);
			
			if(sumA!=sumB) return sumA-sumB;
			
			return a.compareTo(b);
		});
		
		for(String w:wList) {
			System.out.println(w);
		}
		
	}
	static int convert(String str) {
		int sum=0;
		for(char c:str.toCharArray()) {
			if(c>='0' && c<='9') {
				sum+=c-'0';
			}
		}
		return sum;
	}
	//BOJ S3 시리얼 번호 
}
