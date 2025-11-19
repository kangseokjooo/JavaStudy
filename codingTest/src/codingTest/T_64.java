package codingTest;

import java.util.*;

public class T_64 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for(int tc=1; tc<=t; tc++){
            int n = s.nextInt();
            int k = s.nextInt();
            
            String[] grade = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};

            double[] scores = new double[n];
            double ts = 0;

            for(int i=0; i<n; i++){
                int m = s.nextInt();
                int l = s.nextInt();
                int w = s.nextInt();
                double total = m*0.35 + l*0.45 + w*0.2;
                scores[i] = total;

                if(i == k-1) ts = total;
            }
            int rank = 0;
            for(double score : scores){
                if(score > ts) rank++;
            }

            int perGrade = n / 10;
            int gidx = rank / perGrade;
            System.out.println("#" + tc + " " + grade[gidx]);
        }
    }
    //SWEA D2 조교의 성적 매기
}

