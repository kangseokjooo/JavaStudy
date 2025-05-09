package java_algorithm_study;

import java.util.*;

public class Algo_22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N=s.nextInt();
        s.nextLine();
        
        int t1=0,t2=0;
        int l1=0,l2=0;
        int lastTime=0;
        
        for(int i=0;i<N;i++) {
        	String []input=s.nextLine().split(" ");
        	int team=Integer.parseInt(input[0]);
        	String time[]=input[1].split(":");
        	int now=Integer.parseInt(time[0])*60+Integer.parseInt(time[1]);
        	
        	if(t1>t2) {
        		l1+=now-lastTime;
        	}else if(t2>t1) {
        		l2+=now-lastTime;
        	}
        	
        	if(team==1)t1++;
        	else t2++;
        	
        	lastTime=now;
        }
        if(t1>t2) {
        	l1+=48*60-lastTime;
        }else if(t2>t1) {
        	l2+=48*60-lastTime;
        }
        System.out.println(format(l1));
        System.out.println(format(l2));
    }
    static String format(int sec) {
        int min = sec / 60;
        int s = sec % 60;
        return String.format("%02d:%02d", min, s);
    }
    //BJ2852
}
