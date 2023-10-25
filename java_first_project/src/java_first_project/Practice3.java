package java_first_project;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("name?");
			String name=sc.next();
			if(name.equals("홍길동")) {
				System.out.println("남자");
			}else if(name.equals("성춘향")) {
				System.out.println("여자");
			}else System.out.println("모름");
		}
		sc.close();
	}

}
