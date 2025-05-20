package java_algorithm_study;

import java.util.Scanner;

public class Algo_29 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char [][]map=new char[7][7];
		
		for(int i=0;i<7;i++) {
			String row=s.nextLine();
			for(int j=0;j<7;j++) {
				map[i][j]=row.charAt(j);
			}
		}
		
		int []dx= {-1,1,0,0};
		int []dy= {0,0,-1,1};
		
		int cnt=0;
		
		for(int x=0;x<7;x++) {
			for(int y=0;y<7;y++) {
				if(map[x][y]=='o') {
					for(int d=0;d<4;d++) {
						int nx1=x+dx[d];
						int ny1=y+dy[d];
						int nx2=x+2*dx[d];
						int ny2=y+2*dy[d];
						
						if(inRange(nx1,ny1)&&inRange(nx2,ny2)) {
							if(map[nx1][ny1]=='o'&&map[nx2][ny2]=='.') {
								cnt++;
							}
						}
					}
				}
			}
		}
		System.out.println(cnt);
	}
	 private static boolean inRange(int x, int y) {
	        return x >= 0 && x < 7 && y >= 0 && y < 7;
	    }
	 //BJ3010(O)
}
