package java_algorithm_study;

import java.util.LinkedList;
import java.util.Scanner;

public class Day83_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int M = s.nextInt();

		LinkedList<Integer> deque = new LinkedList<Integer>();

		for (int i = 1; i <= N; i++) {
			deque.add(i);
		}
		int[] pos = new int[M];

		for (int i = 0; i < M; i++) {
			pos[i] = s.nextInt();
		}

		int total = 0;

		for (int i = 0; i < M; i++) {
			int tar = pos[i];
			int idx = deque.indexOf(tar);
			int size = deque.size();

			if (idx <= size / 2) {
				for (int j = 0; j < idx; j++) {
					deque.addLast(deque.pollFirst());
					total++;
				}
			} else {
				for (int j = 0; j < size - idx; j++) {
					deque.addFirst(deque.pollLast());
					total++;
				}
			}
			deque.pollFirst();
		}
		System.out.println(total);
	}
	//BJ1021
}
