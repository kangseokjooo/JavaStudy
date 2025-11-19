package codingTest;

import java.util.*;

public class T_58 {
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int t=s.nextInt();
		for(int tc=0;tc<t;t++) {
			int N=s.nextInt();
			List<Integer> list=new ArrayList<Integer>();
			for(int i=0;i<N;i++) {
				list.add(s.nextInt());
			}
			int min=Integer.MAX_VALUE;
			for(int i=1;i<N-1;i++) {
				int a=list.remove(i);
				int d=0;
				for(int j=0;j<N-2;j++) {
					d+=Math.abs(list.get(j)-list.get(j+1));
				}
				min=Math.min(min, d);
				list.add(i, a);
			}
			System.out.println(min);
		}

	}


}
