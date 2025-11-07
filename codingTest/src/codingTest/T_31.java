package codingTest;
import java.util.*;

public class T_31 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int tc=s.nextInt();
		
		for(int t=0;t<tc;t++) {
			int n=s.nextInt();
			Map<String, Integer> map=new HashMap<String, Integer>();
			for(int i=0;i<n;i++) {
				String item=s.next();
				String cate=s.next();
				map.put(cate, map.getOrDefault(cate,0)+1);
			}
			
			int answer=1;
			
			for(int cnt:map.values()) {
				answer*=(cnt+1);
			}
			System.out.println(answer-1);	
		}
	}
	//BOJ S3 패션왕 신혜빈
}
