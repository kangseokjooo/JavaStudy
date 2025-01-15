package java_algorithm_study;

import java.util.Scanner;

public class Algorithm_34 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int [][]board=new int[5][5];
		int []calledNumbers=new int[25];
		boolean [][]marked=new boolean[5][5];
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				board[i][j]=s.nextInt();
			}
		}
		
		for(int i=0;i<25;i++) {
			calledNumbers[i]=s.nextInt();
		}
		
		for(int turn=0;turn<25;turn++) {
			marknum(board,marked,calledNumbers[turn]);
			
			if(countBingo(marked)>=3) {
				System.out.println(turn+1);
				return;
			}
		}
	}
	static void marknum(int[][]board,boolean[][]marked,int number) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(board[i][j]==number) {
					marked[i][j]=true;
					return;
				}
			}
		}
	}
	static int countBingo(boolean [][]marked) {
		int cnt=0;
		for(int i=0;i<5;i++) {
			if(isLineBingo(marked[i])) {
				cnt++;
			}
		}
		
        for (int j = 0; j < 5; j++) {
            boolean isBingo = true;
            for (int i = 0; i < 5; i++) {
                if (!marked[i][j]) {
                    isBingo = false;
                    break;
                }
            }
            if (isBingo) {
                cnt++;
            }
        }
        boolean isCross1 = true;
        for (int i = 0; i < 5; i++) {
            if (!marked[i][i]) {
            	isCross1 = false;
                break;
            }
        }
        if (isCross1) {
            cnt++;
        }
        boolean isCross2 = true;
        for (int i = 0; i < 5; i++) {
            if (!marked[i][4 - i]) {
            	isCross2 = false;
                break;
            }
        }
        if (isCross2) {
            cnt++;
        }
        
        return cnt;

	}
	static boolean isLineBingo(boolean[] line) {
		for(boolean marked:line) {
			if(!marked) {
				return false;
			}
		}
		return true;
	}
//BJ2578
}
