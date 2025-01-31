package java_algorithm_study;

import java.util.*;

public class Algorithm_38 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        s.nextLine();  
        

        List<String> enter = new ArrayList<>();
        for (int i = 0; i < N; i++) {
        	enter.add(s.nextLine());
        }
        

        List<String> exit = new ArrayList<>();
        for (int i = 0; i < N; i++) {
        	exit.add(s.nextLine());
        }
        
        int count = 0;
        
        for (String outCar : exit) {
          
            if (!enter.get(0).equals(outCar)) {
                count++;
                enter.remove(outCar); 
            } else {
            	enter.remove(0);  
            }
        }
        
        System.out.println(count);

    }
    //BJ2002
}
