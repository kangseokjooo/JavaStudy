package java_generic;

import java.util.Arrays;

public class Codingtest2 {
	public static int[] findIndices(int arr[], int target) {
        int[] result = new int[2];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        
        return result; 
    }

	public static void main(String[] args) {
		int nums[]= {3,2,4,4,3,6,8,5};
		int target=9;
		int[] result=findIndices(nums,target);
		System.out.println(Arrays.toString(result));
	}

}
