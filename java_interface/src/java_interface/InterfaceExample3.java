package java_interface;

interface Constants{
	//final 키워드
	//클래스에서 사용: 상속 될 수 없다 final class MyClass {}
	//메소드에서 사용: override 될 수 없다.
	//변수에서 사용: 값 변경이 불가능.(상수화)
	//매개변수에서 사용: 매개변수 값 변경 불가능 void func(final int x){}
	public final int MAX_VALUE=100;
	//public final이 생략됨.
	double PI=3.14;
}
class ConstantsEx implements Constants{
	void display() {
		System.out.println("Maxvalue: "+MAX_VALUE);
		System.out.println("PI: "+PI);
	}
}
public class InterfaceExample3 {

	public static void main(String[] args) {
		ConstantsEx cons=new ConstantsEx();
		cons.display();
	}

}
