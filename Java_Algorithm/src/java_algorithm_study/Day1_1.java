package java_algorithm_study;
import java.util.*;

public class Day1_1 {
	 public String solution(String[] cards1, String[] cards2, String[] goal) {
	        int c1=0;
	        int c1Max=cards1.length;
	        int c2=0;
	        int c2Max=cards2.length;
	        for(int i=0 ;i <goal.length;i++) {
	        	String cur=goal[i];
	        	if(c1 < c1Max && cur.equals(cards1[c1])) {
	        		c1++;
	        	}else if(c2 < c2Max && cur.equals(cards2[c2])) {
	        		c2++;
	        	}
	        	else {
	        		return "No";
	        	}
	        }
	        return "Yes";
	    }
	public static void main(String[] args) {
		Day1_1 d1=new Day1_1();
		String[] c1= {"i","water","drink"};
		String[] c2= {"want","to"};
		String[] g= {"i","want","to","drink","water"};
		String result=d1.solution(c1, c2, g);
		System.out.println(result);
		
	}

}
