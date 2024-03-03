package java_algorithm_study;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day18_2 {

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			
			int N=s.nextInt();
			
			int K=s.nextInt();
			
			int visit[]=new int[100001];
			
			Queue<int[]> q=new LinkedList<int []>();
			for(int i=0;i<100001;i++) {
				visit[i]=100001;
			}
			q.offer(new int[] {N,0});
			
			visit[N]=0;
			
			while(!q.isEmpty()) {
				 int locatime[] = q.poll();

		            if (locatime[0] - 1 >= 0 &&visit[locatime[0]-1]>visit[locatime[0]]+1) {
		                q.offer(new int[]{locatime[0] - 1, locatime[1] + 1});
		                visit[locatime[0] - 1] = locatime[1] + 1;
		            }

		            if (locatime[0] + 1 <= 100000  && visit[locatime[0]+1]>visit[locatime[0]]+1) {
		                q.offer(new int[]{locatime[0] + 1, locatime[1] + 1});
		                visit[locatime[0] + 1] = locatime[1] + 1;
		            }

		            if (locatime[0] * 2 <= 100000 && visit[locatime[0]*2]>visit[locatime[0]]) {
		                q.offer(new int[]{locatime[0] * 2, locatime[1]});
		                visit[locatime[0] * 2] = locatime[1];
		            }
			}
			System.out.println(visit[K]);
	    }

}
