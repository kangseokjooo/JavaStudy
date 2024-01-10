package java_algorithm_study;
import java.util.*;

public class Day2_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int score[]=new int[N];
		long sum=0;
		for(int i=0;i<score.length;i++) {
			score[i]=s.nextInt();
			sum+=score[i];
		}
		long max=0;
		for(int i=0;i<score.length;i++) {
			if(score[i] > max) max=score[i];
		}
		double avg=0;
		avg=sum*100.0/max/N;
		System.out.println(avg);
	}

}
//Arrays.sort
//solve
