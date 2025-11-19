package codingTest;

import java.util.*;

public class T_61 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int t=s.nextInt();
		for(int tc=0;tc<t;tc++) {
			int num=s.nextInt();
			List<Integer> list=new ArrayList<Integer>();
			
			for(int i=2;i*i<=num;i++) {
				while(num%i==0) {
					list.add(i);
					num/=i;
				}
			}
			if(num>1) {
				list.add(num);
			}
			Collections.sort(list);
			
			Map<Integer, Integer> map=new HashMap<Integer, Integer>();
			
			for(int i=0;i<list.size();i++) {
				map.put(list.get(i), map.getOrDefault(list.get(i),0)+1);
			}
			int[] arr = {2, 3, 5, 7, 11};
		    StringBuilder answer = new StringBuilder();
		    for (int a : arr) {
		        int cnt = map.getOrDefault(a, 0);
		        answer.append(cnt).append(" ");
		    }
			
			System.out.println("#"+(tc+1)+" "+answer);
		}
	}

}
