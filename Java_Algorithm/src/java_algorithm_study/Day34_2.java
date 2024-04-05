package java_algorithm_study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Day34_2 {

	public static void main(String[] args) throws IOException  {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N=Integer.parseInt(br.readLine());
		long k=Integer.parseInt(br.readLine());
		long l=1;
		long r=k;
	
		
		while(l < r) {
			long m=(l+r)/2;
			long cnt=0;
			
			for(int i=1;i<=N;i++) {
				cnt+=Math.min(m/i, N);
			}
			if(cnt >= k) {
				r=m;
			}else {
				l=m+1;
			}
		}
		System.out.println(l);
	}

}
