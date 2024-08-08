package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

public class Day96_3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int N=s.nextInt();
        Integer tips[]=new Integer[N];
        
        for(int i=0;i<N;i++) {
        	tips[i]=s.nextInt();
        }
        Arrays.sort(tips,(a,b)->b-a);
        
        long max=0;
        
        for(int i=0;i<N;i++) {
        	int tip=tips[i]-i;
        	if(tip>0) {
        		max+=tip;
        	}
        }
        System.out.println(max);
    }
    //BJ1758
}
