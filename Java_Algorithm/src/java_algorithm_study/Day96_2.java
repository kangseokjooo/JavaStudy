package java_algorithm_study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Day96_2 {
	static class Student{
		int country;
		int number;
		int score;
		
		Student(int country,int number,int score){
			this.country=country;
			this.number=number;
			this.score=score;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		List<Student> sli=new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			int C=s.nextInt();
			int N=s.nextInt();
			int S=s.nextInt();
			sli.add(new Student(C, N, S));
		}
		sli.sort((s1,s2)->s2.score-s1.score);
		
		Map<Integer, Integer> medalMap=new HashMap<Integer, Integer>();
		int medalLimit=0;
		
		for(Student stu:sli) {
			if(medalLimit==3) break;
			
			int cur=medalMap.getOrDefault(stu.country, 0);
			if(cur<2) {
				System.out.println(stu.country+" "+stu.number);
				medalMap.put(stu.country, cur+1);
				medalLimit++;
			}
		}
	}
	//BJ2535
}
