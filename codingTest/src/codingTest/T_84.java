package codingTest;

import java.util.*;

public class T_84 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        for (int tc = 0; tc < t; tc++) {  
            int n = s.nextInt();
            String[] p_n = new String[n];

            for (int i = 0; i < n; i++) p_n[i] = s.next();

            Arrays.sort(p_n);

            boolean flag = true;
            //인접한 두개만 비교해도 됨. 
            for (int i = 0; i < n - 1; i++) {
                if (p_n[i + 1].startsWith(p_n[i])) {
                	System.out.println("NO");
                    flag = false;  
                    break;
                }
            }
            if(flag) System.out.println("YES");
        }
    }
    // BOJ 전화번호 목록 G4
}
