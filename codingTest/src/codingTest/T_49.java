package codingTest;

import java.util.*;

public class T_49 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int N=s.nextInt();
		Map<String,Integer> map=new HashMap<String, Integer>();
		for(int i=0;i<N;i++) {
			String book=s.next();
			map.put(book, map.getOrDefault(book, 0)+1);
		}
		List<String> answer=new ArrayList<String>();
		for(String str:map.keySet()) {
			answer.add(str);
		}
		
		
		answer.sort((a,b)->{
			int fa=map.get(a);
			int fb=map.get(b);
			
			if(fa!=fb) return fb - fa;
			
			return a.compareTo(b);
		});
		
		System.out.println(answer.get(0));
	}
	//BOJ S4 베스트셀러 

}
