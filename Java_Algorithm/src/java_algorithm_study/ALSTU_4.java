package java_algorithm_study;

import java.util.Scanner;

public class ALSTU_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.next();
    

        String[] alphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};


        for (String croatian : alphabets) {
            word = word.replace(croatian, "#"); 
        }


        System.out.println(word.length());
    }
    //BJ2941(O)
}