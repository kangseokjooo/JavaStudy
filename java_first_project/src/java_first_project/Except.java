package java_first_project;

import java.util.*;

public class Except {

	public static void main(String[] args) {
		//0으로 나눌경
//		try {
//			int num1=4;
//			int num2=0;
//			System.out.println(num1+"/"+num2+"="+(num1/num2));
//			
//		} catch (ArithmeticException e) {
//			System.out.println("0으로 나누어서 문제가 발생!");
//			System.out.println(e);
//		}
//		System.out.println("여기까지 읽힐까?");
		
		
		//인덱스 범위를 벗어났을 때
		int intArr[]= {1,2,3,4};
		try {
			for(int i=0;i<intArr.length+1;i++) {
				System.out.println(intArr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위가 벗어났습니다.");
		}
		
		//입력 오류
		Scanner sc=new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		try {
			int a=sc.nextInt();
			System.out.println(a);
		} catch (InputMismatchException e) {
			System.out.println("문자열을 입력하였습니다.");
		}
		
		//숫자 변환 오류 
		//NumberFormatException
		
		//객체참조가 null인 상태에서 객체의 method나 속성에 접근할 때
		//NullPointerException
		
		//파일이 존재하지 않을 때 (컴파일러에 의해 체크됨)
		//FileNotFoundException
		sc.close();
		
	}

}
