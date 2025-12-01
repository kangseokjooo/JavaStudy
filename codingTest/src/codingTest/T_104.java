package codingTest;

import java.util.*;

public class T_104 {
	static char[][] U = new char[3][3];
	static char[][] D = new char[3][3];
	static char[][] F = new char[3][3];
	static char[][] B = new char[3][3];
	static char[][] L = new char[3][3];
	static char[][] R = new char[3][3];

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int t = s.nextInt();
		for (int tc = 0; tc < t; tc++) {
			Cube();

			int n = s.nextInt();

			List<String> cmd = new ArrayList<String>();
			for (int i = 0; i < n; i++) {
				cmd.add(s.next());
			}

			DoCmd(cmd);
			print(U);

		}
	}

	static void Cube() {
		fill(U, 'w');
		fill(D, 'y');
		fill(F, 'r');
		fill(B, 'o');
		fill(L, 'g');
		fill(R, 'b');
	}

	static void fill(char[][] face, char color) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				face[i][j] = color;
			}
		}
	}

	static void print(char face[][]) {
		for (char[] ch : face) {
			System.out.println(ch);
		}
	}

	static void DoCmd(List<String> cmd) {
		for (String c : cmd) {
			char face = c.charAt(0);// U,D,F,B,L,R
			char dir = c.charAt(1);// +,-

			rotate(face, dir);
		}
	}

	static void rotate(char face, char dir) {
		if (face == 'U') {
			rotateSelf(U,dir);
			rotateU(dir);
		}
		if (face == 'D') {
			rotateSelf(D,dir);
			rotateD(dir);
		}
		if (face == 'F') {
			rotateSelf(F,dir);
			rotateF(dir);
		}
		if (face == 'B') {
			rotateSelf(B,dir);
			rotateB(dir);
		}
		if (face == 'L') {
			rotateSelf(L,dir);
			rotateL(dir);
		}
		if (face == 'R') {
			rotateSelf(R,dir);
			rotateR(dir);
		}

	}
	static void rotateSelf(char[][] face,char dir) {
		char [][]tmp=new char[3][3];
		
		if(dir=='+') {
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					tmp[j][2-i]=face[i][j];
				}
			}
		}else {
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					tmp[2-j][i]=face[i][j];
				}
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				face[i][j]=tmp[i][j];
			}
		}
	}
	static void rotateU(char dir) {
		
		if(dir=='+') {
			char [] tmp= {F[0][0],F[0][1],F[0][2]};
		F[0][0]=R[0][0]; F[0][1]=R[0][1]; F[0][2]=R[0][2];
		R[0][0]=B[0][0]; R[0][1]=B[0][1]; R[0][2]=B[0][2];
		B[0][0]=L[0][0]; B[0][1]=L[0][1]; B[0][2]=L[0][2];
		L[0][0]=tmp[0]; L[0][1]=tmp[1]; L[0][2]=tmp[2];
		}else {
			char [] tmp= {F[0][0],F[0][1],F[0][2]};
			F[0][0]=L[0][0]; F[0][1]=L[0][1]; F[0][2]=L[0][2];
			L[0][0]=B[0][0]; L[0][1]=B[0][1]; L[0][2]=B[0][2];
			B[0][0]=R[0][0]; B[0][1]=R[0][1]; B[0][2]=R[0][2];
			R[0][0]=tmp[0]; R[0][1]=tmp[1]; R[0][2]=tmp[2];
		}
	}
    static void rotateD(char dir) {
    	if(dir=='+') {
    		char []tmp= {F[2][0],F[2][1],F[2][2]};
    		F[2][0]=L[2][0]; F[2][1]=L[2][1]; F[2][2]=L[2][2];
    		L[2][0]=B[2][0]; L[2][1]=B[2][1]; L[2][2]=B[2][2];
    		B[2][0]=R[2][0]; B[2][1]=R[2][1]; B[2][2]=R[2][2];
    		R[2][0]=tmp[0]; R[2][1]=tmp[1]; R[2][2]=tmp[2];
    	}else {
    		char[] tmp = { F[2][0], F[2][1], F[2][2] };

            F[2][0] = R[2][0]; F[2][1] = R[2][1]; F[2][2] = R[2][2];
            R[2][0] = B[2][0]; R[2][1] = B[2][1]; R[2][2] = B[2][2];
            B[2][0] = L[2][0]; B[2][1] = L[2][1]; B[2][2] = L[2][2];
            L[2][0] = tmp[0]; L[2][1] = tmp[1]; L[2][2] = tmp[2];

    	}
    }
    static void rotateF(char dir) {
    	if(dir=='+') {
    		char[]tmp= {U[2][0],U[2][1],U[2][2]};
    		
    		U[2][0]=L[2][2]; U[2][1]=L[1][2]; U[2][2]=L[0][2];
    		L[2][2]=D[0][2]; L[1][2]=D[0][1]; L[0][2]=D[0][0];
    		D[0][2]=R[0][0]; D[0][1]=R[1][0]; D[0][0]=R[2][0];
    		R[0][0]=tmp[0]; R[1][0]=tmp[1]; R[2][0]=tmp[2];
    	}else {
    		char[] tmp = { U[2][0], U[2][1], U[2][2] };

            U[2][0] = R[0][0]; U[2][1] = R[1][0]; U[2][2] = R[2][0];
            R[0][0] = D[0][2]; R[1][0] = D[0][1]; R[2][0] = D[0][0];
            D[0][2] = L[2][2]; D[0][1] = L[1][2]; D[0][0] = L[0][2];
            L[2][2] = tmp[0]; L[1][2] = tmp[1]; L[0][2] = tmp[2];
    	}
    	
    }
    static void rotateB(char dir) {
    	if (dir == '+') {
            char[] tmp = { U[0][0], U[0][1], U[0][2] };

            U[0][0] = R[0][2]; U[0][1] = R[1][2]; U[0][2] = R[2][2];
            R[0][2] = D[2][2]; R[1][2] = D[2][1]; R[2][2] = D[2][0];
            D[2][2] = L[2][0]; D[2][1] = L[1][0]; D[2][0] = L[0][0];
            L[2][0] = tmp[0]; L[1][0] = tmp[1]; L[0][0] = tmp[2];
        } else {
            char[] tmp = { U[0][0], U[0][1], U[0][2] };

            U[0][0] = L[2][0]; U[0][1] = L[1][0]; U[0][2] = L[0][0];
            L[2][0] = D[2][2]; L[1][0] = D[2][1]; L[0][0] = D[2][0];
            D[2][2] = R[0][2]; D[2][1] = R[1][2]; D[2][0] = R[2][2];
            R[0][2] = tmp[0]; R[1][2] = tmp[1]; R[2][2] = tmp[2];
        }
    }
    static void rotateL(char dir) {
    	if (dir == '+') {
            char[] tmp = { U[0][0], U[1][0], U[2][0] };

            U[0][0] = B[2][2]; U[1][0] = B[1][2]; U[2][0] = B[0][2];
            B[2][2] = D[0][0]; B[1][2] = D[1][0]; B[0][2] = D[2][0];
            D[0][0] = F[0][0]; D[1][0] = F[1][0]; D[2][0] = F[2][0];
            F[0][0] = tmp[0]; F[1][0] = tmp[1]; F[2][0] = tmp[2];
        } else {
            char[] tmp = { U[0][0], U[1][0], U[2][0] };

            U[0][0] = F[0][0]; U[1][0] = F[1][0]; U[2][0] = F[2][0];
            F[0][0] = D[0][0]; F[1][0] = D[1][0]; F[2][0] = D[2][0];
            D[0][0] = B[2][2]; D[1][0] = B[1][2]; D[2][0] = B[0][2];
            B[2][2] = tmp[0]; B[1][2] = tmp[1]; B[0][2] = tmp[2];
        }
    }
    static void rotateR(char dir) {
        if(dir=='+') {
        	char[] tmp = { U[0][2], U[1][2], U[2][2] };
        U[0][2] = F[0][2]; U[1][2] = F[1][2]; U[2][2] = F[2][2];
        F[0][2] = D[0][2]; F[1][2] = D[1][2]; F[2][2] = D[2][2];
        D[0][2] = B[2][0]; D[1][2] = B[1][0]; D[2][2] = B[0][0];
        B[2][0] = tmp[0]; B[1][0] = tmp[1]; B[0][0] = tmp[2];
    } else {
        char[] tmp = { U[0][2], U[1][2], U[2][2] };

        U[0][2] = B[2][0]; U[1][2] = B[1][0]; U[2][2] = B[0][0];
        B[2][0] = D[0][2]; B[1][0] = D[1][2]; B[0][0] = D[2][2];
        D[0][2] = F[0][2]; D[1][2] = F[1][2]; D[2][2] = F[2][2];
        F[0][2] = tmp[0]; F[1][2] = tmp[1]; F[2][2] = tmp[2];
    }

    }
    
    //BOJ 큐빙 P5 

}
