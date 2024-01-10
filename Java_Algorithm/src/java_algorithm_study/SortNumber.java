package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

public class SortNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int []num= new int[5];
			for(int i=0; i<num.length;i++) {
				num[i]=s.nextInt();
			}
			Arrays.sort(num);
			for(int n:num) {
				System.out.println(n);
			}
		}
	}

