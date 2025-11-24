package codingTest;

import java.util.*;

public class T_81 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String sound=s.next();
		// 문자열 전체가 (100+1+) 또는 (01)의 반복으로만 이루어져 있으면 SUBMARINE
		String patterns="^(100+1+|01)+$";
		
		
		if(sound.matches(patterns)) System.out.println("SUBMARINE");
		else System.out.println("NOISE");
	}
	
	//BOJ 잠수합 식별 G5

}
