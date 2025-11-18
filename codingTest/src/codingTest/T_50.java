package codingTest;

import java.util.*;

public class T_50 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int A=s.nextInt();
		int B=s.nextInt();
		
		int answer=0;
		for(int i=A;i<=B;i++) {
			if(isUnderPrime(i)) {
				answer++;
			}
		}
		System.out.println(answer);
	}
	
	static boolean isUnderPrime(int num) {
		List<Integer> f=new ArrayList<Integer>();
		//소인수분해 
		for(int i=2;i*i<=num;i++) {
			while(num%i==0) {
				f.add(i);
				num/=i;
			}
		}
		if(num>1) {
			f.add(num);
		}
		//소수 판정 
		int a=f.size();
		if(a<2) return false;
		if(a==2||a==3) return true;
		if(a%2==0) return false;
		
		for(int i=3;i*i<=a;i+=2) {
			if(a%i==0) return false;
		}
		return true;	
		
	}
	
	//BOJ S1 언더프라임 

}
