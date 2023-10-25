package java_oop;

public class Truck extends Vehicle {

	public Truck(String type, String color) {
		super(type, color);
			
	}
	
	@Override
	public void Sound() {
		System.out.println("Boom!");
	}

}

