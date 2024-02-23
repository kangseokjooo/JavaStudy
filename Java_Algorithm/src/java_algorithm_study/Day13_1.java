package java_algorithm_study;

import java.util.*;

public class Day13_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

 
        Set<String> words = new HashSet<>();
        for (int i = 0; i < N; i++) {
            words.add(scanner.nextLine());
        }

       
        List<String> sortedWords = new ArrayList<>(words);
        sortedWords.sort((a, b) -> {
            if (a.length() != b.length()) {
                return Integer.compare(a.length(), b.length());
            }
       
            return a.compareTo(b);
        });

        for (String word : sortedWords) {
            System.out.println(word);
        }
   }
}
