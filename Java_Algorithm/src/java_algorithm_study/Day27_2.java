package java_algorithm_study;

import java.util.*;

public class Day27_2{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        
        long exam[]=new long[N];
        for(int i=0;i<N;i++){
            exam[i]=s.nextLong();
        }
        long B=s.nextLong();
        long C=s.nextLong();
        long cnt=0;
        
        for(int i=0;i<N;i++){
            exam[i]-=B;
            
            if(exam[i]>0){
                cnt+=exam[i]/C;
                
                if(exam[i]%C!=0){
                    cnt++;
                }
            }
        }
        
        cnt+=N;
        System.out.println(cnt);
    }
}