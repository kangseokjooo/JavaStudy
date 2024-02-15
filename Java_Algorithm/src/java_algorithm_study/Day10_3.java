package java_algorithm_study;

import java.util.Scanner;

public class Day10_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int E=s.nextInt();
		int S=s.nextInt();
		int M=s.nextInt();
		
		int year=1;
		int x=1,y=1,z=1;
		while(true) {
			if(x ==E && y==S && z==M) {
				break;
			}
			x++;
			y++;
			z++;
			
			if(x>15) x=1;
			if(y>28) y=1;
			if(z>19) z=1;
			
			year++;
		}
		System.out.println(year);
	}

}
