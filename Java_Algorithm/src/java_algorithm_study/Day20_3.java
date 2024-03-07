package java_algorithm_study;

import java.io.*;
import java.util.*;

public class Day20_3 {
    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
        int n = s.nextInt(); 
        long k = s.nextLong();

        long numLen = 1; 
        long numCount = 9; 
        while (k > numCount * numLen) { 
            k -= (numLen * numCount); 
            numLen++;
            numCount *= 10; 
        }
        k -= 1; 

        long num = (long)Math.pow(10, (numLen - 1)) + (k / numLen); 
        if (num > n) { 
            System.out.println(-1); 
        } else {
            System.out.println(String.valueOf(num).charAt((int)(k % numLen))); 
        }
    }
}