package java_algorithm_study;

import java.util.ArrayList;
import java.util.Scanner;

public class Algorithm_19 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        s.nextLine(); 

        ArrayList<String> words = new ArrayList<>(); 

        for (int i = 0; i < N; i++) {
            String word = s.nextLine();
            boolean isUnique = true;

        
            for (String w : words) {
                if (isSame(word, w)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) { 
                words.add(word);
            }
        }

        System.out.println(words.size()); 
    }


    static boolean isSame(String w1, String w2) {
        if (w1.length() != w2.length()) {
            return false; 
        }
        String doubledWord = w1 + w1;
        return doubledWord.contains(w2); 
    }
    //BJ1544
}
