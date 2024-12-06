package java_algorithm_study;

import java.util.Scanner;

public class Algorithm_24 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int T=s.nextInt();
		
		for(int t=0;t<T;t++) {
			int N=s.nextInt();
			int []pigs=new int[6];
			for(int i=0;i<6;i++) {
				pigs[i]=s.nextInt();
			}
			int day=1;
			
			while(true) {
				int nPigs[]=new int[6];
				long total=0;
				
				for(int i=0;i<6;i++) {
					if (day == 1) {
                        nPigs[i] = pigs[i]; 
                    } else {
                        int l = pigs[(i + 5) % 6];
                        int r = pigs[(i + 1) % 6]; 
                        int o = pigs[(i + 3) % 6]; 
                        nPigs[i] = pigs[i] + l + r + o; 
                    }
                    total += nPigs[i]; 
				}
				if(total>N) {
					System.out.println(day);
					break;
				}
				pigs=nPigs;
				day++;
			}
		}
	}
	//BJ3060
}
