package codingTest;

import java.util.*;

public class T_38 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		while (true) {
			String str = s.next();
			if (str.equals("*"))
				break;

			int N = str.length();
			boolean flag = true;
			for (int i = 0; i <= N-2; i++) { //i=0,1,2
				Set<String> set = new HashSet<String>();
				for (int j = 0; j+i+1 < N; j++) {
					int k=j+i+1; //k=0,1,2,3
					String sup = "" + str.charAt(j) + str.charAt(k);
					if (set.contains(sup)) {
						flag = false;
						break;
					}
					set.add(sup);
				}
				if (!flag)
					break;
			}
			if (flag) {
				System.out.println(str + " is surprising.");
			} else {
				System.out.println(str + " is NOT surprising.");
			}

		}
	}
	
	//BOJ S3 놀라운 문자열 

}
