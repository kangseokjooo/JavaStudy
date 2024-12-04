package java_algorithm_study;

import java.util.*;

public class Algorithm_20 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt(); 
        int M = s.nextInt(); 

        int[] r = new int[N + 1]; 
        for (int i = 1; i <= N; i++) {
            r[i] = s.nextInt();
        }
        
        int[] w = new int[M + 1]; 
        for (int i = 1; i <= M; i++) {
            w[i] = s.nextInt();
        }
        
        Queue<Integer> wq = new LinkedList<>(); 
        int[] park = new int[N + 1]; 
        Arrays.fill(park, 0);
        
        int total = 0;
        
        for (int i = 0; i < 2 * M; i++) {
            int event = s.nextInt();
            
            if (event > 0) {
                int car = event;
                boolean isParked = false;
                
                for (int j = 1; j <= N; j++) { 
                    if (park[j] == 0) {
                        park[j] = car;
                        total += w[car] * r[j];
                        isParked = true;
                        break;
                    }
                }
                if (!isParked) {
                    wq.add(car); 
                }
            } else { 
                int car = -event;
                
                for (int j = 1; j <= N; j++) {
                    if (park[j] == car) { 
                        park[j] = 0;
                        
                        if (!wq.isEmpty()) { 
                            int ncar = wq.poll();
                            park[j] = ncar;
                            total += w[ncar] * r[j];
                        }
                        break;
                    }
                }
            }
        }
        System.out.println(total); 
    }
    //BJ5464
}
