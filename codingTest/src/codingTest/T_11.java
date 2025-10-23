package codingTest;

import java.util.*;

public class T_11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int dep[] = new int[N];

		for (int i = 0; i < N; i++) {
			dep[i] = s.nextInt();
		}
		List<Integer> start=new ArrayList<Integer>();
		List<Integer> lengths = new ArrayList<Integer>();
		
		int i=0;
		
		while(i<N) {
			if(dep[i]<0) {
				int st=i;
				int len=0;
				while(i<N&&dep[i]<0) {
					len++;
					i++;
				}
				start.add(st);
				lengths.add(len);
			}else {
				i++;
			}
		}
		if(start.isEmpty()) {
			System.out.println(0);
			return;
		}
		
		
		boolean []m=new boolean[N];
		int bcnt=0;
		for(int k=0;k<start.size();k++) {
			int st=start.get(k);
			int T=lengths.get(k);
			int f=Math.max(0, st-2*T);
			int t=st-1;
			for(int d=f;d<=t;d++) {
				if(!m[d]) {m[d]=true; bcnt++;}
			}
		}
		int max=0;
		for(int T:lengths) max=Math.max(max, T);
		List<Integer> maxList=new ArrayList<Integer>();
		for(int k=0;k<lengths.size();k++) if(lengths.get(k)==max) maxList.add(k);
		
		int answer=bcnt;
		for(int idx:maxList) {
			int st=start.get(idx);
			int ef=Math.max(0, st-3*max);
			int et=Math.max(0, st-2*max)-1;
			if(et<ef) {
				answer=Math.max(answer, bcnt);
				continue;
			}
			int add=0;
			for(int d=ef;d<=et;d++) if(!m[d]) add++;
			answer=Math.max(answer, bcnt+add);
		}
		System.out.println(answer);
		
	}
	//BOJ S2 상범이의 우울(X)
}
