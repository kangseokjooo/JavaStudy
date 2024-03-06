package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

public class Day19_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        int left = 0;
        int right = N - 1;

        int minSum = Integer.MAX_VALUE;
        int x1 = 0;
        int x2 = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (Math.abs(sum) < Math.abs(minSum)) {
                minSum = sum;
                x1 = arr[left];
                x2 = arr[right];
            }

            if (sum < 0) {
                left++;
            } else if (sum > 0) {
                right--;
            } else {
                break;
            }
        }

        System.out.println(x1 + " " + x2);
    }
}
