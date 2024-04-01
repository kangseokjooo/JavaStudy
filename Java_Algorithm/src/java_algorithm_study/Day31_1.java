package java_algorithm_study;

import java.util.*;

public class Day31_1 {
	
    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	int N=s.nextInt();
    	Map<Integer, Integer> tm=new TreeMap<Integer, Integer>();
    	for(int i=0;i<N;i++) {
    		int start=s.nextInt();
    		int end=s.nextInt();
    		tm.put(start, end);
    	}
    	
    	int cnt = 0;
        int et = 0;
        for (Map.Entry<Integer, Integer> entry :tm.entrySet()) {
            int start = entry.getValue();
            int end = entry.getKey();
            if (start >= et) {
            	cnt++;
            	et = end;
            }
        }
        System.out.println(cnt);
    }
}
