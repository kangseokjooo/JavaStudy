package java_algorithm_study;

import java.util.Scanner;

public class Day28_1 {
	public static int Sum(String a) {
		int sum=0;
		String tmp[]=a.split("[+]");
		for(int i=0;i<tmp.length;i++) {
			sum+=Integer.parseInt(tmp[i]);
		}
		return sum;
	}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String exam=s.nextLine();
        String str[]=exam.split("-");
        int result=0;
        for(int i=0;i<str.length;i++) {
        	int tmp=Sum(str[i]);
        	if(i==0)
        		result=result+tmp;
        	else
        		result=result-tmp;
        }
        System.out.println(result);
    }
}
