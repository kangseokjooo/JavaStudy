package java_algorithm_study;

import java.util.*;

public class Day13_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        s.nextLine();

 
        Set<String> words = new HashSet<>();
        
        for (int i = 0; i < N; i++) {
            words.add(s.nextLine());
        }

       
        List<String> sortArr = new ArrayList<>(words);
        
        sortArr.sort((a, b) -> {
            if (a.length() != b.length()) {
                return Integer.compare(a.length(), b.length());
            }
       
            return a.compareTo(b);
        });

        for (String word : sortArr) {
            System.out.println(word);
        }
   }
}
