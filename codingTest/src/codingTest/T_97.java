package codingTest;

//두 톱니바퀴의 맞닿은 부분은 초록색 점선으로 묶여있는 부분이다. 여기서, 3번 톱니바퀴를 반시계 방향으로 회전했다면, 4번 톱니바퀴는 시계 방향으로 회전하게 된다. 2번 톱니바퀴는 맞닿은 부분이 S극으로 서로 같기 때문에, 회전하지 않게 되고, 1번 톱니바퀴는 2번이 회전하지 않았기 때문에, 회전하지 않게 된다. 따라서, 아래 그림과 같은 모양을 만들게 된다
//위와 같은 상태에서 1번 톱니바퀴를 시계 방향으로 회전시키면, 2번 톱니바퀴가 반시계 방향으로 회전하게 되고, 2번이 회전하기 때문에, 3번도 동시에 시계 방향으로 회전하게 된다. 4번은 3번이 회전하지만, 맞닿은 극이 같기 때문에 회전하지 않는다. 따라서, 아래와 같은 상태가 된다.
//
//톱니바퀴의 초기 상태와 톱니바퀴를 회전시킨 방법이 주어졌을 때, 최종 톱니바퀴의 상태를 구하는 프로그램을 작성하시오.

import java.util.*;

public class T_97 {
	static List<Integer> wheel1;
	static List<Integer> wheel2;
	static List<Integer> wheel3;
	static List<Integer> wheel4;

	static int k;
	static int info[][];

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		wheel1 = new ArrayList<>();
		wheel2 = new ArrayList<>();
		wheel3 = new ArrayList<>();
		wheel4 = new ArrayList<>();

		String w1 = s.next();
		String w2 = s.next();
		String w3 = s.next();
		String w4 = s.next();

		for (int i = 0; i < 8; i++)
			wheel1.add(w1.charAt(i) - '0');
		for (int i = 0; i < 8; i++)
			wheel2.add(w2.charAt(i) - '0');
		for (int i = 0; i < 8; i++)
			wheel3.add(w3.charAt(i) - '0');
		for (int i = 0; i < 8; i++)
			wheel4.add(w4.charAt(i) - '0');

		k = s.nextInt();
		info = new int[k][2];
		for (int i = 0; i < k; i++) {
			info[i][0] = s.nextInt();
			info[i][1] = s.nextInt();
			roll(info[i][0], info[i][1]);
		}

		int answer = 0;

		if (wheel1.get(0) == 1)
			answer += 1;
		if (wheel2.get(0) == 1)
			answer += 2;
		if (wheel3.get(0) == 1)
			answer += 4;
		if (wheel4.get(0) == 1)
			answer += 8;

		System.out.println(answer);

	}

	static void roll(int wnum, int dir) {
		int rotate[] = new int[4];

		// 해당 톱니 회전 값 -1,1 반시계,시계
		rotate[wnum-1] = dir;

		// 왼
		for (int i = wnum - 1; i > 0; i--) {
			List<Integer> cur = getWheel(i);
			List<Integer> prev = getWheel(i - 1);
			if (cur.get(6) != prev.get(2))
				rotate[i - 1] = -rotate[i];
			
		}
		// 오
		for (int i = wnum - 1; i < 3; i++) {
			List<Integer> cur = getWheel(i);
			List<Integer> next = getWheel(i + 1);

			if (cur.get(2) != next.get(6))
				rotate[i + 1] = -rotate[i];
		}

		for (int i = 0; i < 4; i++) {
			if (rotate[i] == 1)
				clock(i);
			else if (rotate[i] == 0)
				continue;
			else
				unclock(i);

		}

	}

	static void clock(int idx) {
		List<Integer> wheel = getWheel(idx);

		wheel.add(0, wheel.get(wheel.size() - 1));
		wheel.remove(wheel.size() - 1);
	}

	static void unclock(int idx) {
		List<Integer> wheel = getWheel(idx);
		wheel.add(wheel.size(), wheel.get(0));
		wheel.remove(0);
	}

	static List<Integer> getWheel(int idx) {
		if (idx == 0)
			return wheel1;
		if (idx == 1)
			return wheel2;
		if (idx == 2)
			return wheel3;
		else
			return wheel4;
	}
	//톱니 바퀴 BOJ G5
}
