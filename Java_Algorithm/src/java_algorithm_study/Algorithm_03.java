package java_algorithm_study;

import java.util.Scanner;

public class Algorithm_03 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(); //버스의 개수 입력 
		int T=s.nextInt();// 영식이가 버스터미널에 도착하는 시간을 입력 
		
		int min=Integer.MAX_VALUE; //최소 대기시간 
		boolean isAvailable=false;// 버스 탑승 가능 여부 
		
		for(int i=0;i<N;i++) {
			int Si=s.nextInt(); //현재 버스출발시간
			int Ti=s.nextInt();// 현재버스의 시간 간격 
			int Ci=s.nextInt();//현재 버스 대수 
			
			//현재 버스 대수를 기준으로 버스출발 시간 계산 
			for(int j=0;j<Ci;j++) {
				int bus=Si+j*Ti;//j번째 버스의 출발 시간 
				if(bus>= T) {// 버스출발시간이 영식이의 도착시간 이후 일 경우 
					int wait=bus-T; //현재 버스의 대기시간 계산 
					min=Math.min(min, wait); //대기시간 중 최소 시간을 갱신 
					isAvailable=true; // 영식이가 탈 수있는 버스가 되므로 true로 설정 
					break; //이후 버스는 현재 버스보다 늦게 출발하므로 확인 할 필요가 없다..
				}
			}
		}
		//탈 수 있는 버스가 있다면 최소 대기시간을 출력하고 없으면 -1 출력
		System.out.println(isAvailable ? min:-1);
	}

}
