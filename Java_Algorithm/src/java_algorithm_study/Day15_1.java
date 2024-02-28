package java_algorithm_study;

import java.util.*;

public class Day15_1 {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 List<Integer> list=new ArrayList<Integer>();	        
		 int T = s.nextInt(); 

	    for (int i = 0; i < T; i++) {
	         int n = s.nextInt();
	            
	         int[] arr = new int[n + 1];
	         arr[0]=1;
	         arr[1]=1;
	            if (n>=2) arr[2] = 2;
	            for (int j=3; j<=n; j++) {
	                arr[j] = (arr[j-1]+arr[j-2]+arr[j-3])%1000000009;
	            }
	            list.add(arr[n]);
	        }
	        for(int i=0;i<list.size();i++) {
	        	System.out.println(list.get(i));
	        }
	}

}
