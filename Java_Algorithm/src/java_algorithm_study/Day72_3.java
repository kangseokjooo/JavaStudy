package java_algorithm_study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Day72_3 {
	static class Student{
		int id;
		int re;
		int time;
		
	Student(int id,int re, int time) {
			this.id=id;
			this.re=re;
			this.time=time;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int fcnt=s.nextInt();
		int total=s.nextInt();
		int []reco=new int[total];
		
		for(int i=0;i<total;i++) {
			reco[i]=s.nextInt();
		}
		
		List<Student> li=new ArrayList<>();
		Map<Integer, Student> map=new HashMap<>();
		int cur=0;
		for(int rec:reco) {
			cur++;
			
			if(map.containsKey(rec)) {
				Student stu=map.get(rec);
				stu.re++;
			}else {
				if(li.size() < fcnt) {
					Student nStu=new Student(rec, 1, cur);
					li.add(nStu);
					map.put(rec, nStu);
				}else {
					li.sort((a,b)->{
						if(a.re==b.re) {
							return Integer.compare(a.time, b.time);
						}
						return Integer.compare(a.re, b.re);
					});
					Student rStu=li.remove(0);
					map.remove(rStu.id);
					
					Student newStu=new Student(rec, 1, cur);
					li.add(newStu);
					map.put(rec, newStu);
				}
			}
		}
		List<Integer> result=new ArrayList<Integer>();
		for(Student ss:li) {
			result.add(ss.id);
		}
		Collections.sort(result);
		for(int id:result) {
			System.out.print(id+" ");
		}
	}
	//BJ1713
}
