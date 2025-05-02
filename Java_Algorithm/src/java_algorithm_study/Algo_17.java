package java_algorithm_study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Algo_17 {
	static int a,b,c,n;
	static int total;
	static int []state;
	static class TC{
		int x,y,z,result;
		TC(int x, int y,int z,int result){
			this.x=x;
			this.y=y;
			this.z=z;
			this.result=result;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		total=a+b+c;
		state=new int[total+1];
		Arrays.fill(state, 2);
		
		n=s.nextInt();
		List<TC> test=new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			int x=s.nextInt();
			int y=s.nextInt();
			int z=s.nextInt();
			int r=s.nextInt();
			test.add(new TC(x,y,z,r));
			if(r==1) {
				state[x]=1;
				state[y]=1;
				state[z]=1;
			}
		}
		boolean update;
		do {
			 update = false;
	            for (TC t : test) {
	                if (t.result == 0) {
	                    int cntKnown = 0, cntGood = 0;
	                    if (state[t.x] != 2) {
	                        cntKnown++;
	                        if (state[t.x] == 1) cntGood++;
	                    }
	                    if (state[t.y] != 2) {
	                        cntKnown++;
	                        if (state[t.y] == 1) cntGood++;
	                    }
	                    if (state[t.z] != 2) {
	                        cntKnown++;
	                        if (state[t.z] == 1) cntGood++;
	                    }

	                 
	                    if (cntKnown >= 2 && cntGood == 2) {
	                        if (state[t.x] == 2) {
	                        	state[t.x] = 0;
	                            update = true;
	                        }
	                        if (state[t.y] == 2) {
	                        	state[t.y] = 0;
	                            update = true;
	                        }
	                        if (state[t.z] == 2) {
	                        	state[t.z] = 0;
	                            update = true;
	                        }
	                    }
	                }
	            }
		}while(update);
		
		for(int i=1;i<=total;i++) {
			System.out.println(state[i]);
		}
	}
	//BJ5600
}
