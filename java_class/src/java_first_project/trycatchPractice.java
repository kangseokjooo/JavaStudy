package java_first_project;

public class trycatchPractice {

	public static void main(String[] args) {
		try {
			int []arr= {1,2,3,4};
			for(int i=0;i<arr.length+1;i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스가 범위를 벗어났습니다");
		}
	}

}
