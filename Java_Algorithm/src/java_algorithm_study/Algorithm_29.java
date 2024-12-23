package java_algorithm_study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Algorithm_29 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int []card=new int[4];
		
		for(int i=0;i<4;i++) {
			card[i]=s.nextInt();
		}
		
		int clockNum=getNumber(card);
		
		Set<Integer> unique=new HashSet<Integer>();
		
		for(int i=1111;i<=9999;i++) {
			if(isValid(i)) {
				unique.add(getNumber(toDigit(i)));
			}
		}
		List<Integer> sort=new ArrayList<Integer>(unique);
		Collections.sort(sort);
		
		int rank=sort.indexOf(clockNum)+1;
		System.out.println(rank);
		
		
	}
	static int getNumber(int []card) {
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<4;i++) {
			int num=card[i]*1000+card[(i+1)%4]*100+card[(i + 2) % 4] * 10 + card[(i + 3) % 4];
			min=Math.min(min, num);
		}
		return min;
	}
	static int[] toDigit(int num) {
		return new int[]{num / 1000, (num / 100) % 10, (num / 10) % 10, num % 10};
	}
	static boolean isValid(int num) {
		int []digits=toDigit(num);
		for(int d:digits) {
			if(d<1||d>9) {
				return false;
			}
		}
		return true;
	}
	//BJ2659
}
