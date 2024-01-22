package java_algorithm_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 큐의 크기
        int M = scanner.nextInt(); // 뽑아내려고 하는 원소의 위치

        // 초기 큐 생성
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        int count = 0; // 뽑아내는 데 필요한 이동 횟수

        for (int i = 0; i < M; i++) {
            int target = scanner.nextInt();

            int currentPos = 0;
            int leftMove = 0;
            int rightMove = 0;

            // 왼쪽으로 이동
            while (queue.peek() != target) {
                int front = queue.poll();
                queue.offer(front);
                leftMove++;
            }

            // 오른쪽으로 이동
            while (queue.peek() != target) {
                int rear = queue.poll();
                queue.offer(rear);
                rightMove++;
            }

            // 더 적은 횟수로 이동하여 뽑아내기
            if (leftMove <= rightMove) {
                while (true) {
                    int front = queue.poll();
                    if (front == target) {
                        break;
                    }
                    queue.offer(front);
                    count++;
                }
            } else {
                while (true) {
                    int rear = queue.poll();
                    queue.offer(rear);
                    count++;
                    if (rear == target) {
                        break;
                    }
                }
            }
        }

        System.out.println(count);

        scanner.close();
    }
}
