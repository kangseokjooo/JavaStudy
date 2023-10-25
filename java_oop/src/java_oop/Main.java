package java_oop;

public class Main {

	public static void main(String[] args) {
		//Person(super) 인스턴스 생성 
		Person person=new Person("hong",30);
		System.out.println(person.toString());
		
		//Student
		Student student=new Student("이몽",30,"컴공");
		System.out.println(student.toString());
		
		//하위 클래스에서 부모클래스의 메서드를 사용 
		System.out.println(student.getName());
		System.out.println(student.getAge());
	}

}
