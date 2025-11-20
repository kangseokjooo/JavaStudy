package codingTest;

import java.util.*;

public class T_67 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int t=s.nextInt();
		
		for(int tc=0;tc<t;tc++) {
			int B=s.nextInt();
			int W=s.nextInt();
			int X=s.nextInt();
			int Y=s.nextInt();
			//검->흰,흰->검 
			int Z=s.nextInt();
			
			int sum=B*X+W*Y;
			
			int c=2*Z-(X+Y);
			
			if(c>0) {
				int p=Math.min(B, W);
				sum+=p*c;
			}
			
			System.out.println(sum);
			
		}
	      
		}
	}


