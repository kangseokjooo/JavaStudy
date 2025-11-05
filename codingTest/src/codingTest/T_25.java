package codingTest;

import java.util.*;

public class T_25 {
	
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long a=s.nextLong();
        long b=s.nextLong();
        
        int cnt=0;
        for(long i=a;i<=b;i++) {
        	if(isNum(i)) {
        		cnt++;
        	}
        }
        
        System.out.println(cnt);
        
        
    }
    static boolean isNum(long num) {
    	while(num>0) {
    		long x=num%10;
    		if(x!=4 && x!=7) return false;
    		num/=10;
    	}
    	return true;
    }
    
    //BOJ S1 금민수의 개수 
}
