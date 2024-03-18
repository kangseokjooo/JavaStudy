package java_algorithm_study;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Day24_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		Set<String> chat=new HashSet<>();
		int cnt=0;
		for(int i=0;i<N;i++){
            String str=s.next();
            
            if(!str.equals("ENTER")){
               chat.add(str);
            }else {
            	cnt+=chat.size();
            	chat.clear();
            }
           
        }
		cnt+=chat.size();
		System.out.println(cnt);
	}

}
