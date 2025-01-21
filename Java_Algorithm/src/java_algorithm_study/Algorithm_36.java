package java_algorithm_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Algorithm_36 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long A=s.nextLong();
        long B=s.nextLong();
        
        System.out.println(BFS(A,B));
      
    }
    static int BFS(long a,long b) {
    	Queue<long[]> q=new LinkedList<long[]>();
    	q.add(new long[] {a,1});
    	
    	while(!q.isEmpty()) {
    		long cur[]=q.poll();
    		long value=cur[0];
    		long steps=cur[1];
    		
    		if(value==b) {
    			return (int)steps;
    		}
    		
    		if(value*2<=b) {
    			q.add(new long[] {value*2,steps+1});
    		}
    		if(value*10+1<=b) {
    			q.add(new long[] {value*10+1,steps+1});
    		}
    	}
    	return -1;
    }
}
