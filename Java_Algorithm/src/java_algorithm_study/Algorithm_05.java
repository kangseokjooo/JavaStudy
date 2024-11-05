package java_algorithm_study;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import java_algorithm_study.Day57_4.dis;

public class Algorithm_05 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(); //파일 개수 N을 입력받
		
		ArrayList<int []> files=new ArrayList<int[]>(); //각 파일의 데이터를 저장할 리스트 
		
		//각 데이터 입력 
		for(int i=0;i<N;i++) {
			ArrayList<Integer> file=new ArrayList<Integer>(); //각파일의 데이터를 임시 저장 할 리스트 
			while(true) {
				int num=s.nextInt();
				if(num==-1) break; //-1이면 해당 파일 입력 종료 
				file.add(num); //숫자를 파일 리스트 추가 
			}
			files.add(file.stream().mapToInt(Integer::intValue).toArray()); //파일 리스트를 int 배열로 변환하여 files리스트에 추가 
		}
		int K=1; //모든 파일을 구별 할 수 있는 최소 길이 K 
		boolean distinct=false; //모든 파일이 구별되었는지 확인할 플래그 변수 
		
		//모든 파일이 구별될 때까지 반복 
		while(!distinct) {
			Set<String> seen=new HashSet<String>(); //중복 체크 set
			distinct=true; //각 반복마다 구별이 가능 하다고 가정 
			
			for(int []f:files) {
				StringBuilder sb=new StringBuilder();//현재 파일의 K길이 자른만큼 문자열로 저장 
				
				//현재 파일의 K개 값을 sb에 추가 
				for(int i=0;i<K;i++) {
					if(i<f.length) { //파일의 길이가 K보다 작을 경우 0으로 채움 
						sb.append(f[i]).append(",");
					}else {
						sb.append("0,");
					}
				}
				//중복이 발생한다? 반복종료 (플래그 false)
				if(!seen.add(sb.toString())) {
					distinct=false;
					break;
				}
			}
			if(!distinct) K++; //모든 파일이 구별되지 않으면 K값을 증가 시킴 
		}
		System.out.println(K); //모든 파일을 구별 할 수 있는 K값을 출력 
	}
	//BJ2371
}
