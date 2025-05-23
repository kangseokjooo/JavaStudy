package java_algorithm_study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Algo_41 {
	static class Player{
		int level;
		String name;
		Player(int level,String name){
			this.level=level;
			this.name=name;
		}
	}
	static class Room{
		int bl;
		List<Player> pList=new ArrayList<>();
		
		Room(int bl,Player p) {
			this.bl=bl;
			this.pList.add(p);
		}
		boolean canEnter(Player p,int size) {
			return pList.size()<size&& Math.abs(bl-p.level)<11;
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int p=s.nextInt();
		int m=s.nextInt();
		s.nextLine();
		
		List<Room> rooms=new ArrayList<>();
		
		for(int i=0;i<p;i++) {
			int l=s.nextInt();
			String n=s.next();
			
			Player np=new Player(l, n);
			
			boolean enter=false;
			
			for(Room r:rooms) {
				if(r.canEnter(np, m)) {
					r.pList.add(np);
					enter=true;
					break;
				}
			}
			if(!enter) {
				Room nr=new Room(l, np);
				rooms.add(nr);
			}
		}
		for(Room r:rooms) {
			if(r.pList.size()==m) {
				System.out.println("Started!");
			}else {
				System.out.println("Waiting!");
			}
			Collections.sort(r.pList,Comparator.comparing(p1->p1.name));
			
			for(Player pl:r.pList) {
				System.out.println(pl.level+" "+pl.name);
			}
		}
	}
	//BJ20006

}
