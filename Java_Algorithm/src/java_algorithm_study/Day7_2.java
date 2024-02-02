package java_algorithm_study;

import java.util.Scanner;

public class Day7_2 {

	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int K=s.nextInt();
        double sa[]=new double[N];
        for(int i=0;i<N;i++){
            sa[i]=s.nextDouble();
        }
        for(int i=0;i<K;i++){
            int A=s.nextInt();
            int B=s.nextInt();
            int cnt=B-A+1;
            double total=0;
            for (int j = A - 1; j < B; j++) {
            total += sa[j];
            }
            double result=total/cnt;
            System.out.println(String.format("%.2f",result));
        }
	}

}
