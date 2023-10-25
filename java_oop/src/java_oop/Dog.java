package java_oop;

public class Dog extends Animal {

	public Dog( String name, int age) {
		super("강아지", name, age);
		// TODO Auto-generated constructor stub
	}
	public void makeSound() {
		System.out.println(getName()+"멍멍!");
	}
}
