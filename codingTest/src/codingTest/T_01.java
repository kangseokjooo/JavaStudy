package codingTest;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class T_01 {

	public static void main(String[] args) {	
		Solution s=new Solution();
		 String maps[]={"SOOOL","XXXXO","OOOOO","OXXXX","OOOOE"};
		 String maps1[]={"LOOXS","OOOOX","OOOOO","OOOOO","EOOOO"};
		
		
		
		System.out.println(s.solution(maps));
		System.out.println(s.solution(maps1));
	}

}
class Solution {
		static int dx[]= {1,-1,0,0};
		static int dy[]= {0,0,-1,1};
    public int solution(String[] maps) {
    	int n=maps.length;
    	int m=maps[0].length();
    	char map[][]=new char[n][m];
    	
    	int sx=0,sy=0,lx=0,ly=0,ex=0,ey=0;
    	
    	for(int i=0;i<n;i++) {
    		map[i]=maps[i].toCharArray();
    		for(int j=0;j<m;j++) {
    			if(map[i][j]=='S') {sx=i; sy=j;}
    			if(map[i][j]=='L') {lx=i; ly=j;}
    			if(map[i][j]=='E') {ex=i; ey=j;}
    		}
    	}
    	int Lever=bfs(map,sx,sy,lx,ly);
    	if(Lever==-1) return -1;
    	int Exit=bfs(map,lx,ly,ex,ey);
    	if(Exit==-1) return -1;
        return Lever+Exit;
    }
    static int bfs(char [][]map,int sx,int sy,int tx,int ty) {
    	Queue<int[]> q=new LinkedList<int[]>();
    	int n=map.length;
    	int m=map[0].length;
    	boolean visited[][]=new boolean[n][m];
    	q.add(new int[] {sx,sy,0});
    	visited[sx][sy]=true;
    	
    	while(!q.isEmpty()) {
    		int cur[]=q.poll();
    		int x=cur[0];
    		int y=cur[1];
    		int dist=cur[2];
    		
    		if(x==tx && y==ty) return dist;
    		
    		for(int d=0;d<4;d++) {
    			int nx=x+dx[d];
    			int ny=y+dy[d];
    			
    			if(nx>=n||ny>=m||nx<0||ny<0) continue;
    			if(visited[nx][ny]) continue;
    			if(map[nx][ny]=='X') continue;
    			
    			visited[nx][ny]=true;
    			q.add(new int[] {nx,ny,dist+1});
    			
    		}
    	}
    	return -1;
    }
}
//Programmers L2 미로 탈출X
