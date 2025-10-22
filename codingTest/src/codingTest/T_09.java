package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class T_09 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder  answer=new StringBuilder();
		
		int N=Integer.parseInt(br.readLine());
		int arr[]=new int[N];
		
		int []cnt=new int[8001];
		
		int sum=0;
		for(int i=0;i<N;i++) {
			int n=Integer.parseInt(br.readLine());
			arr[i]=n;
			sum+=n;
			cnt[n+4000]++;
		}
		Arrays.sort(arr);
		
		double avg=(double) sum/N;
		int r=(int) Math.round(avg);
		
		int mid=arr[N/2];
		
		int max=0;
		for(int c:cnt) {
			if(c>max) max=c;
		}
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<cnt.length;i++) {
			if(cnt[i]==max) {
				list.add(i-4000);
			}
		}
		int m=(list.size()>1) ? list.get(1):list.get(0);
		
		int range=arr[N-1]-arr[0];
		
		answer.append(r).append('\n').append(mid).append('\n').append(m).append('\n').append(range);

		System.out.println(answer);
	}
// BOJ S2 통계학 
}
