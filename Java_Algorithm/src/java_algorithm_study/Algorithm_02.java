package java_algorithm_study;

import java.util.ArrayList;
import java.util.Scanner;

public class Algorithm_02 {
	//그래프 방문여부 체크 배열 및 그래프 
	static ArrayList<Integer>[] graph;
	static boolean[] visited;
	
	static int max = 0;
	static int resultNode = 0;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//선배의 수 (노드의 수)
		int N = s.nextInt();
		//그래프 초기화 
		graph = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) {
			graph[i] = new ArrayList<Integer>();
		}
		
		//입력을 받아 각 선배가 가르키는 선배 정보를 그래프에 저장 
		for (int i = 1; i <= N; i++) {
			int n = s.nextInt();
			graph[i].add(n);
		}
		//모든 선배를 시작점으로 DFS탐색 
		for (int i = 1; i <= N; i++) {
			visited = new boolean[N + 1]; //새로운 시작점 마다 방문 배열 초기화 
			int cnt = dfs(i); //i번째 선배를 출발점으로 탐색하여 만날 수 있는 선배수 계산 
			
			//최대 만날수 있는 선배 수와 비교하며 갱신 
			if (cnt > max || (cnt == max && i < resultNode)) {
				max = cnt; //만날 수 있는 최대 선배 수 갱신 
				resultNode = i; //최대 선배 수를 만난 시작 노드 번호 갱신 
			}
		}
		System.out.println(resultNode); //최대 선배 수를 만난 시작 노드 번호 갱신 
	}
	private static int dfs(int node) {
		if(visited[node]) { //이미 방문한 노드면 종료 
			return 0;
		}
		visited[node]=true;// 현재 노드 방문 
		int cnt=1; //현재 노드 포함 만난사람 초기화 
		
		for(int n:graph[node]) {
			cnt+=dfs(n); //다음 노드를 재귀적으로 호출하여 방문수 누적 
		}
		return cnt; //만난 사람 수 반환 
	}
	//BJ3182
}
