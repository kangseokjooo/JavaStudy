package codingTest;

import java.util.*;

public class T_39 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		char map[][] = new char[N][N];

		for (int i = 0; i < N; i++) {
			String row = s.next();
			for (int j = 0; j < N; j++) {
				map[i][j] = row.charAt(j);
			}
		}
		List<int[]> xyList = new ArrayList<int[]>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] != '.') {
					xyList.add(new int[] { i, j });
				}
			}
		}
		int answer = 0;
		int size = xyList.size();

		for (int i = 0; i < size; i++) {
			int arr[] = xyList.get(i);
			for (int j = i + 1; j < size; j++) {
				int arr1[] = xyList.get(j);
				for (int k = j + 1; k < size; k++) {
					int arr2[] = xyList.get(k);

					int x1 = arr[0], y1 = arr[1];
					int x2 = arr1[0], y2 = arr1[1];
					int x3 = arr2[0], y3 = arr2[1];
					
					//3가지점의 직선형태 => 기울기가 같아야 직선이됨 점1과 점2 점1과 점 3 기울기가 같아야 직선이다. 
					if ((x2 - x1) * (y3 - y1) == (y2 - y1) * (x3 - x1)) {
						answer++;
					}
				}
			}
		}
		System.out.println(answer);

	}
	//BOJ S2 트리플렛 

}
