package java_algorithm_study;

import java.util.Scanner;

public class Day27_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int M=s.nextInt();
		s.nextLine();
		
		char board[][]=new char[N][M];
		
		for(int i=0;i<N;i++) {
			String row=s.nextLine();
			for(int j=0;j<M;j++) {
				board[i][j]=row.charAt(j);
			}
		}
		int minpaint=Integer.MAX_VALUE;
		 for (int i=0;i<=N-8;i++) {
	            for (int j=0;j<=M-8;j++) {
	            	minpaint = Math.min(minpaint, count(board, i, j));
	            }
	        }
		 System.out.println(minpaint);
	}
	private static int count(char [][]board,int row,int col) {
		int cnt1=0;
		int cnt2=0;
		char start1 ='W'; 
        char start2 ='B'; 
		for(int i=row;i<row+8;i++) {
			for(int j=col;j<col+8;j++) {
				if(board[i][j]!=start1) {
					cnt1++;
				}
				if(board[i][j]!=start2) {
					cnt2++;
				}
				start1=(start1=='W')?'B':'W';
				start2=(start2=='W')?'B':'W';
			}
			start1=(start1=='W')?'B':'W';
			start2=(start2=='W')?'B':'W';
		}
		return Math.min(cnt1, cnt2);
	}

}
