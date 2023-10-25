package java_first_project;

public class Over {
	//메소드 오버로딩 
	//정수 두개를 더하는 메소드 
	public int add(int a,int b) {
		return a+b;
	}
	//실수 두개를 더하는 메소드 
	public double add(double a,double b) {
		return a + b;
	}
	//정수 3개를 더하는 메소드
	public int add(int a,int b, int c) {
		return a + b + c;
	}
	public static void main(String[] args) {
		Over calc=new Over();
		System.out.println(calc.add(10, 20));
		System.out.println(calc.add(0.15, 0.3));
		System.out.println(calc.add(1, 2, 3));
	}

}
