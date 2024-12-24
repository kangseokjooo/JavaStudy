package java_algorithm_study;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Algorithm_30 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		s.nextLine();
		
		String []words=new String[n];
		
		for(int i=0;i<n;i++) {
			words[i]=s.nextLine();
		}
		
		Map<String, Integer> patternCnt=new HashMap<String, Integer>();
		for(String w:words) {
			String p=Pattern(w);
			patternCnt.put(p, patternCnt.getOrDefault(p, 0)+1);
		}
		
		int similar=0;
		for(int c:patternCnt.values()) {
			if(c>1) {
				similar+=c*(c-1)/2;
			}
		}
		System.out.println(similar);
	}
	static String Pattern(String word) {
		Map<Character, Integer> charMap=new HashMap<Character, Integer>();
		StringBuilder sb=new StringBuilder();
		int idx=0;
		
		for(char c:word.toCharArray()) {
			charMap.putIfAbsent(c, idx++);
			sb.append(charMap.get(c));
		}
		return sb.toString();
	}
	//BJ1411
}
