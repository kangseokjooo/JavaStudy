package java_first_project;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++) {
			System.out.println("age?");
			int age=sc.nextInt();
			if(age>=20) {
				System.out.println("성인");
			}else if(age>=17 && age<=19) {
				System.out.println("고딩");
			}else if(age>=14 && age<=16) {
				System.out.println("중딩");
			}else  System.out.println("아이");
		}
		sc.close();
	}

}
