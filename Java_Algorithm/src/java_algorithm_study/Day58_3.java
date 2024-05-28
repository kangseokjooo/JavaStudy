package java_algorithm_study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Day58_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		List<Wrestler> wlist = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			int power = s.nextInt();
			int magic = s.nextInt();
			wlist.add(new Wrestler(i + 1, power, magic));
		}

		Collections.sort(wlist, new Comparator<Wrestler>() {
			public int compare(Wrestler a, Wrestler b) {
				long aP = (long) a.power + (long) b.power * a.magic;
				long bP = (long) b.power + (long) a.power * b.magic;
				if (aP == bP) {
					return Integer.compare(a.id, b.id);
				}
				return Long.compare(bP, aP);
			}
		});

		for (Wrestler wrestler : wlist) {
			System.out.println(wrestler.id);
		}
	}

	static class Wrestler {
		int id;
		int power;
		int magic;

		Wrestler(int id, int power, int magic) {
			this.id = id;
			this.power = power;
			this.magic = magic;
		}
	}
}
