package codingTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T_83 {
	static Map<Character, Integer> map=new HashMap<Character, Integer>();

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		    map.put('I', 1);
	        map.put('V', 5);
	        map.put('X', 10);
	        map.put('L', 50);
	        map.put('C', 100);
	        map.put('D', 500);
	        map.put('M', 1000);
	        
	        int t=s.nextInt();
	        for(int i=0;i<t;i++) {
	        	String str=s.next();
	        	
	        	if(isNumber(str)) {
	        		int num=Integer.parseInt(str);
	        		System.out.println(tR(num));
	        	}else {
	        		System.out.println(tA(str));
	        	}
	        }
	}
	static boolean isNumber(String str) {
		return Character.isDigit(str.charAt(0));
	}
	//cur < n이면 현재 문자와 다음 문자를 한 쌍으로 처리해서 n-cur을 더함 
	//그러면 다음 문자도 별개로 처리하면 안 되므로, 
	//이미 다음 문자까지 소비했다는 표시로 i를 1 증가
	//i값 총 +2
	static int tA(String str) {
		int sum=0;
		for(int i=0;i<str.length();i++) {
			int cur=map.get(str.charAt(i));
			if(i+1<str.length()) {
				int n=map.get(str.charAt(i+1));
				
				if(cur<n) {
					sum+=n-cur;
					
				}else {
					sum+=cur;
				}
			}else {
				sum+=cur;
			}
		}
		return sum;
	}
	
	static String tR(int num) {
		 int[] values = 
	            {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	        String[] symbols = 
	            {"M",  "CM", "D", "CD", "C", "XC","L","XL","X","IX","V","IV","I"};
	        
	        StringBuilder answer=new StringBuilder();
	        
	        for(int i=0;i<values.length;i++) {
	        	while(num>=values[i]) {
	        		num-=values[i];
	        		answer.append(symbols[i]);
	        	}
	        }
	     return answer.toString();
	}
	
	//로마 숫자 BOJ G4 

}
