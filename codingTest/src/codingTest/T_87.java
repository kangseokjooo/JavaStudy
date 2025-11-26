package codingTest;

import java.util.*;
public class T_87 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int tc = 0; tc < t; tc++) {
            String str = s.next();
            char[] arr = str.toCharArray();

            boolean ok = next(arr);
            if (!ok) {
               
                System.out.println(str);
            } else {
                System.out.println(new String(arr));
            }
        }
    }
    static boolean next(char[] a) {
        int n = a.length;
        int i = n - 2;
        
        while (i >= 0 && a[i] >= a[i + 1]) i--;
       
        if (i < 0) return false; 

        int j = n - 1;
        while (a[j] <= a[i]) j--;


        char tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;

       
        int l = i + 1, r = n - 1;
        while (l < r) {
            char t = a[l];
            a[l] = a[r];
            a[r] = t;
            l++; r--;
        }
        return true;
    }
    //BOJ S1단어 맞추기 (X)
}
