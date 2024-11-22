package java_algorithm_study;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//수열 A[1], A[2], …, A[N]이 주어진다.
//이 수열에 다음 작업을 반복하면 몇 번째 만에 모든 값이 같아지는지 계산하라.
//모두 같아지는 것이 불가능한 경우 -1을 출력한다.
//
//작업: 수열의 K번째 원소를 제일 마지막에 추가하고, 수열의 첫 원소를 지운다.
//
//아래 첫 번째 입력으로 주어진 수열에서 작업을 진행하는 경우를 보자.
//수열은 {1, 5, 5, 3} -> {5, 5, 3, 5} -> {5, 3, 5, 5} -> {3, 5, 5, 3} -> {5, 5, 3, 5}와 같이 바뀌어 모두 같아지는 일 없이 반복된다.
//따라서 이 경우의 답은 -1이다.
//
//[제약사항]
//1.	N은 4 이상 500 이하이다. (4 ≤ N ≤ 500)
//2.	수열의 원소는 1 이상 10 이하의 자연수이다.
//
//
//가장 첫 줄에는 테스트 케이스의 총 수가 주어진다.
//그 다음 줄부터 각 테스트 케이스가 주어지며, 각 테스트 케이스는 2줄로 구성된다.
//각 테스트 케이스의 첫 줄에는 N과 K의 값이 주어진다.
//다음 줄에 수열의 원소들의 순서대로 주어진다
//
//출력의 각 줄은 ‘#x’로 시작하고, 공백을 한 칸 두고 최소 작업 횟수 혹은 -1을 출력한다.
//단, x는 테스트 케이스의 번호이다.
//
//
//3                              // 테스트 케이스의 수
//4 2                           // N = 4, 테스트 케이스 #1
//1 5 5 3
//4 1                           // N = 4, 테스트 케이스 #2
//3 3 3 3
//4 3                           // N = 4, 테스트 케이스 #3
//
//2 3 4 4
//
//#1 -1
//#2 0
//#3 2

public class Algorithm_16 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		
		for(int t=1;t<=T;t++) {
			int N=s.nextInt();
			int K=s.nextInt();
			
			int []arr=new int[N];
			
			for(int i=0;i<N;i++) {
				arr[i]=s.nextInt();
			}
			int cnt=0;
			Set<String> seenSet=new HashSet<String>();
			while(true) {
				if(AllEqual(arr)) {
					System.out.println("#"+t+" "+cnt);
					break;
				}
				String cur=Arrays.toString(arr);
				if(seenSet.contains(cur)) {
					System.out.println("#"+t+" "+-1);
					break;
				}
				seenSet.add(cur);
				
				int lastValue=arr[K-1];
				for(int i=0;i<N-1;i++) {
					arr[i]=arr[i+1];
				}
				arr[N-1]=lastValue;
				cnt++;
			}
		}
	}
	static boolean AllEqual(int []arr) {
		int first=arr[0];
		for(int v:arr) {
			if(v!=first) {
				return false;
			}
		}
		return true;
	}

}
