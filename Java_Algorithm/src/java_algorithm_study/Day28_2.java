package java_algorithm_study;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Day28_2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Set<String> set = new HashSet<String>();
        while (true) {
            String str =s.nextLine();
            if (str.equals("0")) {
                break;
            }
            for (int i=0;i<str.length();i++) {
                for (int j = i + 1; j <= str.length(); j++) {
                    set.add(str.substring(i, j));
                }
            }
            String st = maxprime(set);
            System.out.println(st);
            set.clear();
        }
    }

    public static String maxprime(Set<String> set) {
        String max="";
        for (String str:set) {
            if (isNumeric(str)&&isprime(Long.parseLong(str))&&str.length()>max.length()) {
                max = str;
            }
        }
        return max;
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    public static boolean isprime(long l) {
        if (l<=1) {
            return false;
        }
        for (int i=2; i*i<=l;i++) {
            if (l%i==0) {
                return false;
            }
        }
        return true;
    }
}
