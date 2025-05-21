package java_algorithm_study;



public class Gcd_Lcm {

	 public static void main(String[] args) {
	        int a = 12, b = 15, c = 20;

	        int gcdResult = gcd(gcd(a, b), c);
	        int lcmResult = lcm(lcm(a, b), c);

	        System.out.println("GCD: " + gcdResult); 
	        System.out.println("LCM: " + lcmResult); 
	    }

	    public static int gcd(int a, int b) {
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	    }

	    public static int lcm(int a, int b) {
	        return a * b / gcd(a, b);
	    }
}
