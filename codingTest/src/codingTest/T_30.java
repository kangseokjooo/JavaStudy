package codingTest;

import java.util.*;

public class T_30 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(true) {
			int n=s.nextInt();
			if(n==0) break;
			int answer=0;
			for(int i=n+1;i<=2*n;i++) {
				if(isPrime(i)) {
					answer++;
				}
			}
			
			System.out.println(answer);
		}
		
	}
	 static boolean isPrime(int num) {
	        if (num < 2) return false;
	        if (num == 2 || num == 3) return true;
	        if (num % 2 == 0) return false; 

	      
	        for (int i = 3; i * i <= num; i += 2) {
	            if (num % i == 0) return false;
	        }
	        return true;
	    }
	
	//BOJ S3 베르트랑 공준

}
