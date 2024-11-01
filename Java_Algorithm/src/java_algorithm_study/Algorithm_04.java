package java_algorithm_study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Algorithm_04 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(); //놀이기구 개수 입력 
		
		ArrayList<int []> rideList=new ArrayList<int[]>();
		
		for(int i=0;i<N;i++) {
			int start=s.nextInt(); //놀이기구 시작시간(HH:MM)
			int end=s.nextInt();//놀이기구 종료시간(HH:MM)
			rideList.add(new int[] {tTom(start)-10,tTom(end)+10}); //놀이기구 시작 10분 종료 10분 조정하여 추
		}
		Collections.sort(rideList,Comparator.comparingInt(a->a[0])); //시작시간을 기준으로 정렬 
		
		int max=Integer.MIN_VALUE; //최대쉬는시간
		int cur=tTom(1000); // 놀이 공원 운영 시작시간 10:00을 분으로 변환하여 초기화 
		
		for(int []r:rideList) {
			//다음 놀이기구 시작 시간이 끝시간보다 크다면 휴식가능 조건 
			if(r[0]>cur) {
				max=Math.max(max,r[0]-cur); //가장 긴 휴식 시간 갱
			}
			cur=Math.max(cur, r[1]); //현재 시간 갱신: 다음 놀이기구의 종료시간(r[1])과 현재시간 중 큰값으로 갱신 
		}
		max=Math.max(max,tTom(2200)-cur); //마지막 놀이기구 종료 후 부터 폐장시간 까지의 공백 시간 계산 
		System.out.println(max > 0 ? max:0); //최대 휴게시간이 음수일 경우만날수는 없다.
	}
		//시간(HH:MM)을 분 단위로 변환하는 메서드)
		static int tTom(int T) {
			int h=T/100;
			int m=T%100;
			return h*60+m;
		}
		//BJ2594
}
