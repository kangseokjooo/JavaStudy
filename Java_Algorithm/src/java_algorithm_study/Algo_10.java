package java_algorithm_study;

import java.util.*;

public class Algo_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        
        int []times=new int[N];
        for(int i=0;i<N;i++) {
        	times[i]=s.nextInt();
        }
        
        Arrays.sort(times);
        reverse(times);
        
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        for(int i=0;i<M;i++) pq.add(0);
        
        for(int t:times) {
        	int cur=pq.poll();
        	pq.add(cur+t);
        }
        int max=0;
        while(!pq.isEmpty()) {
        	max=Math.max(max, pq.poll());
        }
        System.out.println(max);
    }
    static void reverse(int []arr) {
    	int l=0;
    	int r=arr.length-1;
    	while(l<r) {
    		int tmp=arr[l];
    		arr[l]=arr[r];
    		arr[r]=tmp;
    		l++;
    		r--;
    	}
    }
    //BJ23843(O)
}
