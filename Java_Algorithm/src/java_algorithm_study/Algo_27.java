package java_algorithm_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Algo_27 {
	static class Document {
		int idx;
		int p;

		Document(int idx, int p) {
			this.idx = idx;
			this.p = p;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();

		while (T-- > 0) {
			int N = s.nextInt();
			int M = s.nextInt();

			Queue<Document> q = new LinkedList<>();

			int[] p = new int[10];

			for (int i = 0; i < N; i++) {
				int priority = s.nextInt();
				q.add(new Document(i, priority));
				p[priority]++;
			}
			int x = 0;

			while (!q.isEmpty()) {
				Document cur = q.poll();
				
				boolean isHigh=false;
				for(int i=cur.p+1;i<=9;i++) {
					if(p[i]>0) {
						isHigh=true;
						break;
					}
				}
				if(isHigh) {
					q.add(cur);
				}else {
					x++;
					p[cur.p]--;
					
					if(cur.idx==M) {
						System.out.println(x);
						break;
					}
				}
			}
		}
	}
	//BJ1966(X)

}
