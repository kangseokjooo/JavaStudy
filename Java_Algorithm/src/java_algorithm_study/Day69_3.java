package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

public class Day69_3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T=s.nextInt();
        
        for(int t=0;t<T;t++) {
        	int N=s.nextInt();
        	int M=s.nextInt();
        	
        	int []A=new int[N];
        	int []B=new int[M];
        	
        	for(int i=0;i<N;i++) {
        		A[i]=s.nextInt();
        	}
        	for(int i=0;i<M;i++) {
        		B[i]=s.nextInt();
        	}
        	
        	Arrays.sort(A);
        	Arrays.sort(B);
        	
        	int cnt=0;
        	
        	for(int i=0;i<N;i++) {
        		int target=A[i];
        		
        		int l=0;
        		int h=M-1;
        		int idx=-1;
        		
        		while(l<=h) {
        			int m=(l+h)/2;
        			
        			if(B[m]<target) {
        				idx=m;
        				l=m+1;
        			}else {
        				h=m-1;
        			}
        		}
        		if(idx!=-1) {
        			cnt+=(idx+1);
        		}
        	}
        	System.out.println(cnt);
        }
    }
    //BJ7795
}
