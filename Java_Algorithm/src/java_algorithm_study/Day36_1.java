package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

public class Day36_1 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        int L=s.nextInt();   
        int restArr[]=new int[N + 2];
        restArr[0] = 0;
        for(int i=1;i<=N;i++) {
            restArr[i]=s.nextInt();
        }
        restArr[N+1]=L;
        Arrays.sort(restArr);
        
        int l=1;
        int r=L-1;
        int result=0;
        
        while(l<=r) {
            int m=(l+r)/2;
            int cnt=0;
            
            for(int i=1;i<restArr.length;i++) {
                cnt+=(restArr[i]-restArr[i-1]-1)/m;
            }
            
            if(cnt<=M) {
                r=m-1;
                result=m;
            }else {
                l=m+1;
            }
        }
        System.out.println(result);
    }
}
