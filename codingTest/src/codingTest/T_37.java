package codingTest;
import java.util.*;
public class T_37 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int t=s.nextInt();
		for(int tc=0;tc<t;tc++) {
			String str=s.next();
			if(str.matches("^[A-F]?A+F+C+[A-F]?$")) {
				System.out.println("Infected!");
			}else {
				System.out.println("Good");
			}
			
		}
	}
	//BOJ S3 염색체 
}
