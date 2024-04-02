package java_algorithm_study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Day32_3 {
	static int[][]map;
	static int N;
	static int size=2;
	static int X,Y;
	static int direction[][]= {{-1,0},{0,-1},{0,1},{1,0}};
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        N=s.nextInt();
        map=new int[N][N];
        
        for(int i=0;i<N;i++) {
        	for(int j=0;j<N;j++) {
        		map[i][j]=s.nextInt();
        		if(map[i][j]==9) {
        			X=i;
        			Y=j;
        			map[i][j]=0;
        		}
        	}
        }
        int total=0;
        int eat=0;
        while(true) {
        	int time=move();// 움직이고 먹는시간..
        	if(time==0)break;
        	total+=time;
        	eat++;
        	if(eat==size) {
        		size++;
        		eat=0;
        	}
        }
        System.out.println(total);
      }
    static int move() {
    	boolean visited[][]=new boolean[N][N];
    	Queue<int []> q=new LinkedList<int[]>();
    	List<int []> tar=new ArrayList<int[]>();
    	
    	visited[X][Y]=true;//상어 방문 여부 
    	q.offer(new int[] {X,Y,0}); //시작위치부터의 거리 
    	
    	while(!q.isEmpty()) {
    		int current[]=q.poll(); //현재의 위치 
    		int x=current[0]; //x좌표 
    		int y=current[1]; //y좌표 
    		int distance=current[2];
    		
    		for(int []dir:direction) {
    			int nx=x+dir[0]; // 다음 x좌표 위치 
    			int ny=y+dir[1]; //다음 y좌표 위치
    			//다음 위치가 공간 내에 있고, 방문하지 않았고, 이동 가능하면 
    			if(nx >=0 && nx<N && ny >=0 && ny<N && !visited[nx][ny] && map[nx][ny]<=size) {
    				visited[nx][ny]=true; //다음 위치를 방문했음을 표시 
    				q.offer(new int[] {nx,ny,distance +1}); 
    				//다음위치에 물고기가 있고 아기 상어가 먹을 수 있는 크기보다 작으면 
    				if(map[nx][ny] !=0&& map[nx][ny] <size) {
    					tar.add(new int[] {nx,ny,distance+1}); //후보 리스트에 추가 
    				}
    			}
    		}
    	}
    	if(tar.isEmpty())
    	return 0;
    	
    	Collections.sort(tar,(a,b)->{
    		if(a[2]!=b[2]) return a[2]-b[2];//distance가 짧은 순서대
    		if(a[0]!=b[0]) return a[0]-b[0]; //가장 상에 있는 물고기 
    		return a[1]-b[1]; //가장 왼쪽에있는 물고기로 
    	});
    	//가장 윗쪽에있는 물고기 위치 정보를 가져
    	int target[]=tar.get(0);
    	int tx=target[0];
    	int ty=target[1];
    	int time=target[2];
    	
    	//상어 위치 갱신 
    	X=tx;
    	Y=ty;
    	
    	map[tx][ty]=0; //먹은 물고기는 빈칸으로 변경 
    	
    	return time; //총 이동시간 반환 
    }
    //unsolved 
}
