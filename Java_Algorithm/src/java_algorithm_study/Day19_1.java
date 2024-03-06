package java_algorithm_study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Day19_1 {

	public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);
	        int N=scanner.nextInt();
	        int count=0; 
	        int num=0;   
	        while(count<N) {
	            num++;
	            if (Dcnum(num)) {
	                count++;
	            }
	            if(num >= 987654321) {
	            	num=-1;
	            	break;
	            }
	        }
	        System.out.println(num);
	    }
	    public static boolean Dcnum(int n) {
	        String str=Integer.toString(n);
	        for (int i=1;i<str.length();i++) {
	            if (str.charAt(i)>=str.charAt(i-1)) {
	                return false;
	            }
	        }

	        return true;
	    }
}

