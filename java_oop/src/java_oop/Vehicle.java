package java_oop;

public class Vehicle {
	private String type;
	private String color;
	public Vehicle(String type, String color) {
		super();
		this.type = type;
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void Sound() {
		System.out.println("지날때 소리");
	}
}
