package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

public class Day3_1 {

	public static void main(String[] args) {
		//2차원 배열의크기
		Scanner s=new Scanner(System.in);
		int arrSize=s.nextInt();
		int qNo=s.nextInt();
		int arr[][]=new int[arrSize+1][arrSize+1];
		for(int i=1;i<=arrSize;i++) {
			for(int j=1;j<=arrSize;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		int hapArr[][]=new int[arrSize+1][arrSize+1];
		//합배열 값할당 (구간합)
		for(int i=1;i<=arrSize;i++) {
			for(int j=1;j<=arrSize;j++) {
				hapArr[i][j]=hapArr[i][j-1]+hapArr[i-1][j]-hapArr[i-1][j-1]+arr[i][j];
			}
		}
		for(int i=0;i<qNo;i++) {
			int x1=s.nextInt();
			int y1=s.nextInt();
			int x2=s.nextInt();
			int y2=s.nextInt();
			int result=hapArr[x2][y2]-hapArr[x1-1][y2]-hapArr[x2][y1-1]+hapArr[x1-1][y1-1];
			System.out.println(result);
		}
	}
	//solve

}
