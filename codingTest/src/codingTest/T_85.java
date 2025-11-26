package codingTest;

import java.util.*;

public class T_85 {
    static class Command {
        String op;
        String a;
        int t;

        Command(String op, String a, int t) {
            this.op = op;
            this.a = a;
            this.t = t;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Command> work = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String op = s.next();
            String arg = s.next();
            int time = s.nextInt();
            work.add(new Command(op, arg, time));
        }

      
        List<Integer> times = new ArrayList<>();
        List<String> states = new ArrayList<>();

        times.add(0);      
        states.add("");   

        for (Command c : work) {
            String prev = states.get(states.size() - 1);
            if (c.op.equals("type")) {
              
                states.add(prev + c.a);
                times.add(c.t);
            } else {
                
                int target = c.t - Integer.parseInt(c.a);

            
                int idx = 0;
                for (int i = times.size() - 1; i >= 0; i--) {
                    if (times.get(i) < target) {  
                        idx = i;
                        break;
                    }
                }
                states.add(states.get(idx));
                times.add(c.t);
            }
        }
//       System.out.println(times);
//       System.out.println(states);

       System.out.println(states.get(states.size() - 1));

    }
    //BOJ 되돌리기 G5
}
