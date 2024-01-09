package java_algorithm_study;

import java.util.HashMap;
import java.util.Map;

public class Day1 {
	public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> index=new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++) {
        	char cur=s.charAt(i);
        	if(index.containsKey(cur)) {
        		int value=index.get(cur);
        		answer[i]=i - value;
        	}else {
        		answer[i]=-1;
        	}
        	index.put(cur,i);
        }
        return answer;
    }
	public static void main(String[] args) {
		Day1 d = new Day1();
        String s = "banana";
        int[] result = d.solution(s);

        System.out.print("결과: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
		
	}
}
