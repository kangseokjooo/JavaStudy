package java_algorithm_study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Day80_2 {
	static class Game{
		int d,start,end;
		Game(int d,int start,int end) {
			this.d=d;
			this.start=start;
			this.end=end;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int T=s.nextInt();
		
		for(int t=0;t<T;t++) {
			int m=s.nextInt();
			List<Game> gli=new ArrayList<>();
			
			for(int i=0;i<m;i++) {
				int d=s.nextInt();
				int start=s.nextInt();
				int end=s.nextInt();
				gli.add(new Game(d, start, end));
			}
			System.out.println("Scenario #"+(t+1)+":");
			System.out.println(maxGame(gli));
			System.out.println();
		}
	}
		static int maxGame(List<Game> gli) {
			Map<Integer, List<Game>> gmap=new HashMap<Integer, List<Game>>();
			for(Game g:gli) {
				gmap.putIfAbsent(g.d, new ArrayList<>());
				gmap.get(g.d).add(g);
			}
			int max=0;
			
			for(List<Game> dayGame:gmap.values()) {
				Collections.sort(dayGame,(a,b)->a.end-b.end);
				
				int cnt=0;
				int last=-1;
				
				for(Game g:dayGame) {
					if(g.start>=last) {
						cnt++;
						last=g.end;
					}
				}
				max+=cnt;
		}
			return max;
	}
		//BJ7507
}
