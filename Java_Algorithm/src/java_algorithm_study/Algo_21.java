package java_algorithm_study;

import java.util.*;

public class Algo_21 {
    static int[] parent;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt(); 
        int M = s.nextInt();

        parent = new int[N + 1];
        for (int i = 1; i <= N; i++) parent[i] = i;

        int truthCount = s.nextInt(); 
        Set<Integer> truth = new HashSet<>();
        for (int i = 0; i < truthCount; i++) {
            int t = s.nextInt();
            truth.add(t);
        }

        List<List<Integer>> parties = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            int partySize = s.nextInt();
            List<Integer> party = new ArrayList<>();
            for (int j = 0; j < partySize; j++) {
                int person = s.nextInt();
                party.add(person);
            }


            for (int j = 1; j < party.size(); j++) {
                union(party.get(0), party.get(j));
            }
            parties.add(party);
        }

    
        Set<Integer> tr = new HashSet<>();
        for (int t : truth) {
        	tr.add(find(t));
        }

        int count = 0;
        for (List<Integer> party : parties) {
            boolean canLie = true;
            for (int person : party) {
                if (tr.contains(find(person))) {
                    canLie = false;
                    break;
                }
            }
            if (canLie) count++;
        }

        System.out.println(count);
    }

    static int find(int x) {
        if (parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }

    static void union(int a, int b) {
        int ra = find(a);
        int rb = find(b);
        if (ra != rb) {
            parent[rb] = ra;
        }
    }
    //BJ1043
}
