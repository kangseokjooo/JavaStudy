package codingTest;

import java.util.*;

public class T_60 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		for (int tc = 1; tc <= n; tc++) {
			String str = String.valueOf(tc);

			int claps = 0;

			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '3' || str.charAt(i) == '6' || str.charAt(i) == '9') {
					claps++;
				}

			}
			if(claps>0) {
				for(int i=0;i<claps;i++) System.out.print("-");
			}else {
				System.out.print(str);
			}
			System.out.print(" ");	
		}
	}
	//SWEA D2 간단한 369

}
