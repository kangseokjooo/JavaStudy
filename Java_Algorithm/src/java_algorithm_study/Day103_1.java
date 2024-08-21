package java_algorithm_study;

import java.util.Scanner;

public class Day103_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int N = s.nextInt();
        int C = s.nextInt();
        int W = s.nextInt();
        
        int[] tree = new int[N];
        int maxLength = 0;
        

        for (int i = 0; i < N; i++) {
            tree[i] = s.nextInt();
            maxLength = Math.max(maxLength, tree[i]);
        }
        
        int maxProfit = 0;
        
   
        for (int length = 1; length <= maxLength; length++) {
            int cur = 0;
            
            for (int j = 0; j < N; j++) {
                int treeLength = tree[j];
                
                if (treeLength < length) continue;
                
                int p = treeLength / length;
                int r = treeLength % length;  
                int cut = p - 1; 

              
                int profit = p * length * W;  
                int cost = cut * C;  

                if (r > 0) {
                    cost += C;  
                }
                
                cur += (profit - cost);
            }
            
            maxProfit = Math.max(maxProfit, cur);
        }
        
        System.out.println(maxProfit);
    }
    //BJ1421(X)
}
