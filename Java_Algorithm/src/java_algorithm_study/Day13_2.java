package java_algorithm_study;
import java.util.*;
public class Day13_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int K=s.nextInt();
		int arr[]=new int[N];
	
		for(int i=0;i<N;i++) {
			arr[i]=s.nextInt();
		}
		int maxt = Integer.MIN_VALUE; 
        for (int i=0;i<=N-K;i++) { 
            int sum=0;
            for (int j=i;j<i+K;j++) { 
                sum+=arr[j];
            }
            maxt=Math.max(maxt, sum);
        }
       System.out.println(maxt);
	}

}
