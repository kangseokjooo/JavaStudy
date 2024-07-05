package java_algorithm_study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day77_1 {
	static class Train{
		String number;
		List<Integer> times;
		public Train(String number,List<Integer> times) {
			this.number=number;
			this.times=times;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		int M=s.nextInt();
		int N=s.nextInt();
		s.nextLine();
		
		List<Train> trains=new ArrayList<>();
		
		for(int i=0;i<T;i++) {
			String line=s.nextLine();
			String p[]=line.split(" ");
			String num=p[0];
			List<Integer> times=new ArrayList<Integer>();
			for(int j=1;j<p.length-1;j++) {
				times.add(Integer.parseInt(p[j]));
			}
			trains.add(new Train(num, times));
		}
		int cur=M;
		String last="";
		for(int i=0;i<N;i++) {
			int n=Integer.MAX_VALUE;
			for(Train t:trains) {
				for(int time:t.times) {
					if(time>=cur) {
						if(time<n) {
							n=time;
							last=t.number;
						}
						break;
					}
				}
			}
			cur=n;
		}
		System.out.println(last);
	}
	//BJ1678(memory)
}
