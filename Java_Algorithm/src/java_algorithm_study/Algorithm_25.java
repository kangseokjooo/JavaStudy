package java_algorithm_study;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Algorithm_25 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int T=s.nextInt();
		
		for(int t=0;t<T;t++) {
			int N=s.nextInt();
			s.nextLine();
			
			String []robots=new String[N];
			
			for(int i=0;i<N;i++) {
				robots[i]=s.nextLine();
			}
			
			int  k=robots[0].length();
			Set<Integer> acRobot=new HashSet<Integer>();
			
			for(int i=0;i<N;i++) {
				acRobot.add(i);
			}
			for(int r=0;r<k;r++) {
				if(acRobot.size()==1)break;
				
				Map<Character, Set<Integer>> moveMap=new HashMap<Character, Set<Integer>>();
				moveMap.put('R', new HashSet<>());
				moveMap.put('P', new HashSet<>());
				moveMap.put('S', new HashSet<>());
				
				for(int robot:acRobot) {
					char move=robots[robot].charAt(r);
					moveMap.get(move).add(robot);
				}
				Set<Integer> remove=new HashSet<Integer>();
				if(moveMap.get('R').size()>0 && moveMap.get('P').size()>0&& moveMap.get('S').size()>0) {
					continue;
				} else if (moveMap.get('R').size() > 0 && moveMap.get('P').size() > 0) {
                    remove.addAll(moveMap.get('R')); // 바위가 보에게 패배
                } else if (moveMap.get('P').size() > 0 && moveMap.get('S').size() > 0) {
                    remove.addAll(moveMap.get('P')); 
                } else if (moveMap.get('S').size() > 0 && moveMap.get('R').size() > 0) {
                    remove.addAll(moveMap.get('S')); 
				}
				acRobot.removeAll(remove);
			}
			if(acRobot.size()==1) {
				System.out.println(acRobot.iterator().next()+1);
			}else {
				System.out.println(0);
			}
		}
	}
	//BJ8896
}
