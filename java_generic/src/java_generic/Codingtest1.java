package java_generic;

public class Codingtest1 {
	
	public static int sumLessthan(int[] arr, int target) {
        int sum = 0;
        for (int num : arr) {
            if (num < target) {
                sum += num;
            }
        }
        return sum;
    }

	public static void main(String[] args) {
		 int num[]= {2,5,8,3,7};
		 int target = 5;
	     int result = sumLessthan(num, target);
		System.out.println(result);
	}

}
