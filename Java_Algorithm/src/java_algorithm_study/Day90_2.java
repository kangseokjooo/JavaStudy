package java_algorithm_study;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Day90_2 {
	static class Village {
		int x;
		int a;

		Village(int x, int a) {
			this.x=x;
			this.a=a;
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int N=s.nextInt();
		
		List<Village> vlist=new ArrayList<>();
		
		for(int i=0;i<N;i++) {
			int x=s.nextInt();
			int a=s.nextInt();
			
			vlist.add(new Village(x, a));
		}
		
		vlist.sort(Comparator.comparingInt(v->v.x));
		
		
		long total=0;
		
		for(Village v:vlist) {
			total+=v.a;
		}
		
		long population=0;
		int post=0;
		
		for(Village v:vlist) {
			population+=v.a;
			
			if(population>=(total+1)/2) {
				post=v.x;
				break;
			}
		}
		System.out.println(post);
		
	}

}
