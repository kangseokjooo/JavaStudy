package java_algorithm_study;

import java.util.Scanner;

public class Day75_5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String doc = s.nextLine();  
        String word = s.nextLine(); 
        s.close();

        int dL = doc.length();
        int wL = word.length(); 
        int cnt = 0; 

 
        for (int i = 0; i <= dL - wL;) {
            boolean match = true; 

   
            for (int j = 0; j < wL; j++) {
                if (doc.charAt(i + j) != word.charAt(j)) {
                    match = false; 
                    break;
                }
            }


            if (match) {
                cnt++;
                i += wL; 
            } else {
                i++;  
            }
        }

        System.out.println(cnt); 
    }
    //BJ1543
}
