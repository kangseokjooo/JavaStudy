package codingTest;

import java.util.*;
public class T_55 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for(int t=0; t<T; t++){
        	long L=s.nextLong();
        	long R=s.nextLong();
        	
        	if((R+1)/2.0>L) {
        		System.out.println("no");
        	}else {
        		System.out.println("yes");
        	}
        }
    }
    //SWEA 묶음판매 
 
}

