package codingTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T_35 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int land = s.nextInt();
		for (int t = 0; t < land; t++) {
			int a = s.nextInt();
			Map<Long, Long> am = new HashMap<Long, Long>();
			for (int i = 0; i < a; i++) {
				Long army = s.nextLong();
				am.put(army, am.getOrDefault(army, (long) 0) + 1);
			}
			boolean flag = false;
			for (Map.Entry<Long, Long> entry : am.entrySet()) {
				if (entry.getValue() > a / 2) {
					System.out.println(entry.getKey());
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println("SYJKGW");
			}
		}

	}
	//BOJ S3 전쟁 땅따먹기
}
