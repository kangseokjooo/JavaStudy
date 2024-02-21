package java_algorithm_study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Day11_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		int N=s.nextInt();
		List<Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<N;i++) {
			int num = s.nextInt();
			arr.add(num);
		}
		Collections.sort(arr);
		for(Integer c : arr) {
			sb.append(c).append("\n");
		}
		
		System.out.println(sb);
	}

}
