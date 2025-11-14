package codingTest;

import java.util.*;
import java.util.Map.Entry;
public class T_42 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int N=s.nextInt();
		int M=s.nextInt();
		
		Map<String,Integer> wordMap=new HashMap<String, Integer>();
		for(int i=0;i<N;i++) {
			String word=s.next();
			wordMap.put(word,wordMap.getOrDefault(word, 0)+1);
		}
		List<String> answerList=new ArrayList<String>();
		
		//길이가 M보다 작으면 제외 
		for(String word:wordMap.keySet()) {
			if(word.length()>=M) {
				answerList.add(word);
			}
		}
		//우선순위 1,2,3 정렬 
		answerList.sort((a,b)->{
			int fA=wordMap.get(a);
			int fB=wordMap.get(b);
			//빈도가 많을수록 
			if (fA != fB) return fB - fA;

			//길이가 길수록 
		    if (a.length() != b.length()) return b.length() - a.length();

		    // 그후 사전순으로 정렬 
		    return a.compareTo(b);

			
	});
		
		for(String w:answerList) {
			System.out.println(w);
		}
		
	}
	//BOJ S3 영단어 암기는 괴로워 

}
