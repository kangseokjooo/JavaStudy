package java_algorithm_study;

import java.util.Scanner;

public class Day16_1 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt(); 

       
        int T[]=new int[N + 1];
        int P[]=new int[N + 1];
        int maxArr[]=new int[N + 2];

       
        for (int i=1;i<= N;i++) {
            T[i]=s.nextInt();
            P[i]=s.nextInt();
        }

      
        for (int i=1;i<=N;i++) {
            maxArr[i] = Math.max(maxArr[i],maxArr[i-1]);
            if (i+T[i]<=N+1) { 
                maxArr[i+T[i]]=Math.max(maxArr[i+T[i]],maxArr[i]+P[i]);
            }
            maxArr[i+1]=Math.max(maxArr[i+1],maxArr[i]);
        }    
        System.out.println(maxArr[N+1]);
    }
}

