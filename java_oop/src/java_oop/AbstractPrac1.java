package java_oop;

abstract class Studentss{
	String name;
	String school;
	int studentId;
	int age;
	public Studentss(String name, String school, int studentId, int age) {
		this.name = name;
		this.school = school;
		this.studentId = studentId;
		this.age = age;
	}
	 abstract public void todo(); 
}
class Kim extends Studentss{

	public Kim(String name, String school, int studentId, int age) {
		super(name, school, studentId, age);
	}
	public void todo() {
		System.out.println("점심은 김가네 김밥 ");
	}
	
}
class Beak extends Studentss{

	public Beak(String name, String school, int studentId, int age) {
		super(name, school, studentId, age);
	}
	public void todo() {
		System.out.println("저녁은 백종원 피자 ");
	}
	
}

public class AbstractPrac1 {

	public static void main(String[] args) {
		Kim k=new Kim("kk", "kkk", 123, 123);
		Beak b=new Beak("lll", "lll", 121, 121);
		
		k.todo();
		b.todo();
	}

}
