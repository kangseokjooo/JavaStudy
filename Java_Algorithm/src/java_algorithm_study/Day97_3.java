package java_algorithm_study;

import java.util.*;

public class Day97_3 {
	static int [][]map;
	static boolean [][]visited;
	static int N;
	
	static int dx[]= {-1,1,0,0};
	static int[]dy= {0,0,-1,1};
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        N=s.nextInt();
        map=new int[N][N];
        
        for(int i=0;i<N;i++) {
        	for(int j=0;j<N;j++) {
        		map[i][j]=s.nextInt();
        	}
        }
        int max=0;
        
        for(int i=0;i<=100;i++) {
        	visited=new boolean[N][N];
        	int safe=0;
        	
        	for(int j=0;j<N;j++) {
        		for(int k=0;k<N;k++) {
        			if(map[j][k]>i&&!visited[j][k]) {
        				bfs(j,k,i);
        				safe++;
        			}
        		}
        	}
        	max=Math.max(max, safe);
        	
        }
        System.out.println(max);
    }
    static void bfs(int x,int y,int h) {
    	Queue<int []> q=new LinkedList<int[]>();
    	q.offer(new int[] {x,y});
    	visited[x][y]=true;
    	
    	while(!q.isEmpty()) {
    		int pos[]=q.poll();
    		int cx=pos[0];
    		int cy=pos[1];
    		
    		for(int i=0;i<4;i++) {
    			int nx=cx+dx[i];
    			int ny=cy+dy[i];
    			
    			if(nx>=0&&nx<N&&ny>=0&&ny<N&&!visited[nx][ny] &&map[nx][ny]>h) {
    				visited[nx][ny]=true;
    				q.offer(new int[] {nx,ny});
    				
    						
    			}
    		}
    	}
    }
    //BJ2568
}
