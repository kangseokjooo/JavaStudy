package java_algorithm_study;

import java.util.Scanner;

public class Day63_3 {
	static int N;
	static String map[][];
	static boolean visited[][];
	static int dx[]= {-1,1,0,0};
	static int dy[]= {0,0,-1,1};
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		map=new String[N][2];
		visited=new boolean[N][2];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<2;j++) {
				map[i][j]=s.nextLine();
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		
	}

}
