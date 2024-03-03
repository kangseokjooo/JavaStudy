package java_algorithm_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Day18_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N=Integer.parseInt(br.readLine());
		
		HashSet<String> employee=new HashSet<String>();
		
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			String name=st.nextToken();
			String workState=st.nextToken();
			
			if(workState.equals("enter")) {
				employee.add(name);
			}else{ //"leave"
				employee.remove(name);
			}
		}
		List<String> em=new ArrayList<String>(employee);
		
		Collections.sort(em, Collections.reverseOrder());
		
		for(String a : em) {
			System.out.println(a);
		}
	}

}
