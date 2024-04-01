package java_algorithm_study;

import java.util.Scanner;

public class Day32_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int result =str.length();
        for(int i=0;i<str.length();i++) {
        	if(!isPalindrome(str.substring(i))) {
        		result++;
        	}else {
        		break;
        	}
        }
        
        System.out.println(result);


    }
   static boolean isPalindrome(String str) {
        int l = 0;
        int r =str.length()-1;
        while (l<r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
