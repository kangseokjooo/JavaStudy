package java_algorithm_study;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Algorithm_06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String key = s.next();       // 키 입력 (열의 순서를 정하는 기준)
		String cipher = s.next();    // 암호문 입력

		int numCols = key.length();  // 열의 개수 (키의 길이)
		int numRows = cipher.length() / numCols; // 행의 개수 (암호문 길이 / 키의 길이)

		Integer[] keyIdx = new Integer[numCols]; // 키의 각 문자의 인덱스를 저장할 배열

		for (int i = 0; i < numCols; i++) {
			keyIdx[i] = i;            // 키의 각 문자 인덱스를 배열에 저장
		}

		// 키의 문자 순서를 기준으로 인덱스를 정렬
		Arrays.sort(keyIdx, Comparator.comparingInt(a -> key.charAt(a)));

		char[][] ch = new char[numRows][numCols]; // 복호화된 암호문을 저장할 행렬

		int cIdx = 0; // 암호문을 읽을 현재 인덱스 위치

		// 사전순으로 정렬된 열 인덱스 순서에 따라 암호문을 열 단위로 채움
		for (int col : keyIdx) {
			for (int row = 0; row < numRows; row++) {
				ch[row][col] = cipher.charAt(cIdx++);
			}
		}

		StringBuilder sb = new StringBuilder(); // 평문을 저장할 StringBuilder

		// 행 단위로 평문을 읽어 평문 생성
		for (int row = 0; row < numRows; row++) {
			for (int col = 0; col < numCols; col++) {
				sb.append(ch[row][col]);
			}
		}
		
		// 복원된 평문을 출력
		System.out.println(sb.toString());
	}
	//BJ2149
}
