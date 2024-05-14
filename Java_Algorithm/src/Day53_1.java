import java.util.Scanner;

public class Day53_1 {
    static int max;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            char[] arr = sc.next().toCharArray();
            int swapCnt = sc.nextInt();
            max = Integer.parseInt(new String(arr));
            findMax(arr, swapCnt);
            System.out.printf("#%d %d%n", test_case, max);
        }
        sc.close();
    }

    private static void findMax(char[] arr, int swapCnt) {
        if (swapCnt == 0) return;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    swap(arr, i, j);
                    int num = Integer.parseInt(new String(arr));
                    max = Math.max(max, num);
                    findMax(arr, swapCnt - 1);
                    swap(arr, i, j); 
                }
            }
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
