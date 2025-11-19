package codingTest;

import java.util.*;

public class T_63 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int t=s.nextInt();
		for(int tc=0;tc<t;tc++) {
			int n=s.nextInt();
			int k=s.nextInt();
			
			int arr[]=new int[n];
			int prefix[]=new int[n+1];
			for(int i=0;i<n;i++) arr[i]=s.nextInt();
			
			for(int i=1;i<=n;i++) {
				prefix[i]=prefix[i-1]+arr[i-1];
			}
			List<Integer> list=new ArrayList<Integer>();
			for(int i=0;i<=n-k;i++) {
				int sum=prefix[i+k]-prefix[i];
				list.add(sum);
			}
			Collections.sort(list);
			int answer=list.get(list.size()-1)-list.get(0);
			
			System.out.println("#"+(tc+1)+" "+answer);
		}
	}
	//구간

}
