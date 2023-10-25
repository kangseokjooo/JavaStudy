package java_oop;

public class Animal {
	private String spec;
	private String name;
	private int age;
	public Animal(String spec, String name, int age) {
		this.setSpec(spec);
		this.name = name;
		this.age = age;
	}
	public void makeSound() {
		System.out.println("동물소리를 냅니다");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSpec() {
		return spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}
	
}
