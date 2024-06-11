package java_algorithm_study;

import java.util.Scanner;

public class Day65_1 {
		
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		s.nextLine();
		char graph[][]=new char[N][N];
		for(int i=0;i<N;i++) {
			graph[i]=s.nextLine().toCharArray();
		}
		int twoFriends=friends(graph,N);
		System.out.println(twoFriends);
	}
	static int friends(char graph[][],int N) {
		int max=0;
		for(int i=0;i<N;i++) {
			boolean []checkfriends=new boolean[N];
			int cnt=0;
			for(int j=0;j<N;j++) {
				if(i==j) continue;
				if(graph[i][j]=='Y') {
					if(!checkfriends[j]) {
						checkfriends[j]=true;
						cnt++;
					}
					for(int k=0;k<N;k++) {
						if(graph[j][k]=='Y' && i!=k && !checkfriends[k]) {
							checkfriends[k]=true;
							cnt++;
						}
					}
				}
			}
			if(cnt> max) {
				max=cnt;
			}
		}
		return max;
	}
}
