package java_algorithm_study;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Day17_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
        Set<Integer> A = new HashSet<>();
        for (int i = 0; i < n; i++) {
            A.add(s.nextInt());
        }
        Set<Integer> B = new HashSet<>();
        for (int i = 0; i < m; i++) {
            B.add(s.nextInt());
        }
        Set<Integer> diffAB = new HashSet<>(A);
        diffAB.removeAll(B);
        
        Set<Integer> diffBA = new HashSet<>(B);
        diffAB.removeAll(A);
        int result=diffAB.size()+diffBA.size();
        System.out.println(result);
	}

}
