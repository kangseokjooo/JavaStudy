package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

public class Day55_2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        s.close();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

		System.out.println(Arrays.toString(arr).replaceAll("[\\[\\],]", ""));

        while (Permutation(arr)) {
            System.out.println(Arrays.toString(arr).replaceAll("[\\[\\],]", ""));
        }
    }

    public static boolean Permutation(int[] arr) {
        int i = arr.length - 1;
        while (i > 0 && arr[i - 1] >= arr[i]) {
            i--;
        }
        if (i <= 0) {
            return false;
        }

        int j = arr.length - 1;
        while (arr[j] <= arr[i - 1]) {
            j--;
        }

        int temp = arr[i - 1];
        arr[i - 1] = arr[j];
        arr[j] = temp;

        j = arr.length - 1;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return true;
    }
}
