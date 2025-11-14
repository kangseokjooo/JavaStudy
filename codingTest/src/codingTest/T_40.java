package codingTest;

import java.util.*;
public class T_40 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		
		List<Integer> answer=new ArrayList<Integer>(); 
		for(int i=2;i<=num;i++) {
			if(isPrime(i) && isSG(i)) {
				answer.add(i);
			}
		}
		
		for(int a:answer) {
			System.out.println(a);
		}
			
		
	}
	static boolean isPrime(int num) {
		if(num==2 || num ==3)return true;
		if(num%2==0) return false;
		
		for(int i=3;i*i<=num;i+=2) {
			if(num%i==0) return false;
		}
		return true;
	}
	static boolean isSG(int num) {
		Set<Integer> set=new HashSet<Integer>();
		while(num!=1) {
			//같은숫자가 반복된다=>무한루프임 
			if(set.contains(num)) {
				return false;
			}
			set.add(num);
			
			int sum=0;
			int cur=num;
			while(cur>0) {
				int d=cur%10;
				sum+=d*d;
				cur/=10;
			}
			num=sum;
		}
		return true;
	}
	//BOJ S1 소수상근수  

}
