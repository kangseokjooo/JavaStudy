package java_algorithm_study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Algorithm_15 {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int caseNumber=1;
        
        while(true) {
        	int N=s.nextInt();
        	if(N==0) {
        		break;
        	}
        	s.nextLine();
        	Map<String, String> map=new HashMap<String, String>();
        	List<String> names=new ArrayList<String>();
        	
        	for(int i=0;i<N;i++) {
        		String g=s.next();
        		String r=s.next();
        		
        		map.put(g, r);
        		names.add(g);
        	}
        	Set<String> visit=new HashSet<String>();
        	
        	int chain=0;
        	
        	for(String n:names) {
        		if(!visit.contains(n)) {
        			Set<String> cSet=new HashSet<String>();
        			String cur=n;
        			while(!cSet.contains(cur)) {
        				if(visit.contains(cur)) {
        					break;
        				}
        				cSet.add(cur);
        				visit.add(cur);
        				cur=map.get(cur);
        			}
        			if(cSet.contains(cur)) {
        				chain++;
        			}
        		}
        	}
        	System.out.println(caseNumber+" "+chain);
        	caseNumber++;
        	
        }

    }
}
