package java_algorithm_study;

import java.util.*;

public class Algo_8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int A=s.nextInt();
        int K=s.nextInt();
        
        
        boolean []visited=new boolean[1000001];
        
        Queue<int []> q=new LinkedList<int[]>();
        q.offer(new int[] {A,0});
        visited[A]=true;
        
        while(!q.isEmpty()) {
        	int []cur=q.poll();        
        	int num=cur[0];
        	int cnt=cur[1];
        	
        	if(num==K) {
        		System.out.println(cnt);
        		return;
        	}
        	
        	 if (num + 1 <= K && !visited[num + 1]) {
                 visited[num + 1] = true;
                 q.offer(new int[]{num + 1, cnt + 1});
             }

             if (num * 2 <= K && !visited[num * 2]) {
                 visited[num * 2] = true;
                 q.offer(new int[]{num * 2, cnt + 1});
             }
        }
    }
    //BJ25418
}
