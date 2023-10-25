package java_oop;

public class Practice1 {
	public static void main(String[ ]args) {
		Cat cat=new Cat("hkk", 5);
		Dog dog=new Dog("kkk", 4);
		
		
		System.out.println("고양이 "+cat.getName()+"  "+cat.getAge()+"세");
		cat.makeSound();
		System.out.println("강아지"+dog.getName()+"  "+dog.getAge()+"세");
		dog.makeSound();
	}
}
