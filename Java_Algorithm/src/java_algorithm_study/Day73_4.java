package java_algorithm_study;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day73_4 {

    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	
    	int N=s.nextInt();
    	s.nextLine();
    	
    	String[] correct=s.nextLine().split(" ");
    	String[] hyunwoo=s.nextLine().split(" ");
    	
    	Map<String, Integer> idxMap=new HashMap<String, Integer>();
    	for(int i=0;i<N;i++) {
    		idxMap.put(correct[i], i);
    	}
    	
    	int cp=0;
    	
    	for(int i=0;i<N;i++) {
    		for(int j=i+1;j<N;j++) {
    			int cIdx1=idxMap.get(hyunwoo[i]);
    			int cIdx2=idxMap.get(hyunwoo[j]);
    			
    			if(cIdx1<cIdx2) {
    				cp++;
    			}
    		}
    	}
    	int total=N*(N-1)/2;

    	int a=cp;
    	int b=total;
    	
    	System.out.println(a+"/"+b);
    	
    	
    	
    }
    //BJ3077
}
