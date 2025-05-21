package java_algorithm_study;

import java.util.ArrayList;
import java.util.Scanner;

public class Algo_37 {
	static int[][] dist;
	static int T=Integer.MAX_VALUE;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int V=s.nextInt();
		int E=s.nextInt();
		
		dist=new int[V+1][V+1];
		
		for(int i=1;i<=V;i++) {
			for(int j=1;j<=V;j++) {
				if(i==j) dist[i][j]=0;
				else dist[i][j]=T;
			}
		}
		
		for(int i=0;i<E;i++) {
			int a=s.nextInt();
			int b=s.nextInt();
			int d=s.nextInt();
			
			dist[a][b]=d;
		}
		
		for (int k = 1; k <= V; k++) {
            for (int i = 1; i <= V; i++) {
                for (int j = 1; j <= V; j++) {
                    if (dist[i][j] > dist[i][k] + dist[k][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }
		
		int result=T;
		
		for(int i=1;i<=V;i++) {
			for(int j=1;j<=V;j++) {
				if(i!=j&&dist[i][j]!=T&&dist[j][i]!=T) {
					result=Math.min(result, dist[i][j]+dist[j][i]);
				}
			}
		}
		System.out.println(result==T ? -1 :result);
		
	}

}
