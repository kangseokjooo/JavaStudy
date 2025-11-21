package codingTest;

public class T_76 {
	static int arr[] = { 1, 2, 3, 4, 5 };
	static int S = 3;
	static int cnt = 0;

	public static void main(String[] args) {
		bt(0, 0);
		
		System.out.println(cnt);

	}

	static void bt(int idx, int sum) {
		if (idx == arr.length) {
			if (sum == S) {
				cnt++;
			}
				return;
			}
			
			bt(idx+1,sum+arr[idx]);
			bt(idx+1,sum);
			
		
	}

}
