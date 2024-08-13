package java_algorithm_study;

import java.util.*;

public class Day98_2 {
    static int[][] board=new int[5][5];
    static Set<String> numbers=new HashSet<String>();
    static int[] dx= {0,0,1,-1};
    static int[] dy= {1,-1,0,0};
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for(int i=0;i<5;i++) {
        	for(int j=0;j<5;j++) {
        		board[i][j]=s.nextInt();
        	}
        }
        for(int i=0;i<5;i++) {
        	for(int j=0;j<5;j++) {
        		dfs(i,j,0,"");
        	}
        }
        System.out.println(numbers.size());
    }
    static void dfs(int x,int y,int d,String cur) {
    	if(d==6) {
    		numbers.add(cur);
    		return;
    	}
    	
    	cur+=board[x][y];
    	for(int i=0;i<4;i++) {
    		int nx=x+dx[i];
    		int ny=y+dy[i];
    		 if (nx >= 0 && nx < 5 && ny >= 0 && ny < 5) {
                 dfs(nx, ny, d + 1, cur);
             }
    	}
    }
    //BJ2210
}
