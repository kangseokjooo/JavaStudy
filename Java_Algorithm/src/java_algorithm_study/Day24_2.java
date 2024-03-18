package java_algorithm_study;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Day24_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		Map<String, Integer> hm=new HashMap<String, Integer>();
		for(int i=0;i<N;i++) {
			String bt=s.next();
			hm.put(bt, hm.getOrDefault(bt, 0)+1);
		}
		String bs="";
		int Smax=0;
		for (Map.Entry<String, Integer> entry : hm.entrySet()) {
			String bt = entry.getKey();
            int sale = entry.getValue();
            if (sale > Smax) {
            	Smax=sale;
            	bs=bt;
            } else if (sale==Smax&&bt.compareTo(bs) < 0) {
                bs=bt;
            }
		}
		System.out.println(bs);
	}

}
