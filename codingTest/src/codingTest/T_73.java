package codingTest;

import java.util.*;

public class T_73 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        for(int tc = 0; tc < t; tc++){
            String str = s.next();
            System.out.println(isPossible(str));
        }
    }

    static int isPossible(String str){
        int n = str.length();
        int l = 0, r = n - 1;
        int cnt = 0;

        while(l < r){
            char lc = str.charAt(l);
            char rc = str.charAt(r);

            if(lc == rc){
                l++;
                r--;
            } else if(lc == 'x'){
                l++;
                cnt++;
            } else if(rc == 'x'){
                r--;
                cnt++;
            } else {
                return -1; 
            }
        }

        return cnt;
    }
    //SWEA 회문 만들기 
}
