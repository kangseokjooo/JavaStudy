package java_algorithm_study;

import java.util.Scanner;

public class ALSTU_6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int N=s.nextInt();
		int [][]cards=new int[N][5];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<5;j++) {
				cards[i][j]=s.nextInt();
			}
		}
		int maxLast=-1;
		int result=-1;
		
		for(int i=0;i<N;i++) {
			int maxPerson=-1;
			
			for(int a=0;a<5;a++) {
				for(int b=a+1;b<5;b++) {
					for(int c=b+1;c<5;c++) {
						int sum=cards[i][a]+cards[i][b]+cards[i][c];
						int lastNum=sum%10;
						maxPerson=Math.max(maxPerson, lastNum);
					}
				}
			}
			if(maxPerson>=maxLast) {
				maxLast=maxPerson;
				result=i+1;
			}
		}
		System.out.println(result);
		
	}
	//BJ2303(O)
}
