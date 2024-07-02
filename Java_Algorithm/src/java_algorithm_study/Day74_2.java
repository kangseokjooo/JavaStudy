package java_algorithm_study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day74_2 {
	static class Student{
		String name;
		int k;
		int e;
		int m;
		
	Student(String name,int k,int e,int m) {
			this.name=name;
			this.k=k;
			this.e=e;
			this.m=m;
		}
	}
    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	int n=s.nextInt();
    	
    	List<Student> sli=new ArrayList<>();
    	
    	for(int i=0;i<n;i++) {
    		String name=s.next();
    		int k=s.nextInt();
    		int e=s.nextInt();
    		int m=s.nextInt();
    		sli.add(new Student(name, k, e, m));
    	}
    	sli.sort((a,b)->{
    		if(a.k!=b.k) {
    			return b.k-a.k;
    		}else if(a.e!=b.e) {
    			return a.e-b.e;
    		}else if(a.m!=b.m){
    			return b.m-a.m;
    		}else {
    			return a.name.compareTo(b.name);
    		}
    	});
    	for(Student st:sli) {
    		System.out.println(st.name);
    	}
    }
    //BJ10835
}
