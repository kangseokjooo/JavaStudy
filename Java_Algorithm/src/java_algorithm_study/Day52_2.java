package java_algorithm_study;

import java.util.Scanner;
import java.io.FileInputStream;


class Day52_2
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		for(int test_case =1; test_case <= 10; test_case++)
		{
         	int T=sc.nextInt();
    		int num1=sc.nextInt();
    		int num2=sc.nextInt();
    		int num3=pow(num1, num2);
    		System.out.println("#"+test_case+" "+num3);
		}
	}
	static int pow(int num1,int num2) {
		int result=1;
		for(int i=0;i<num2;i++) {
			result*=num1;
		}
		return result;
	}
}