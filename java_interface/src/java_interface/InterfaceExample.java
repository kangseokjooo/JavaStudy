package java_interface;

interface Controller{
	void powerOn();
	void powerOff();
	default void display() {
		System.out.println("Display");
	}
}

class TV implements Controller{

	@Override
	public void powerOn() {
		System.out.println("TV power on");	
	}

	@Override
	public void powerOff() {
		System.out.println("TV power off");	
	}
	
}

class Computer implements Controller{

	@Override
	public void powerOn() {
		System.out.println("Computer power on");	

	}

	@Override
	public void powerOff() {
		System.out.println("Computer power off");	

	}
	
}

public class InterfaceExample {

	public static void main(String[] args) {
		TV tv=new TV();
		Computer com=new Computer();
		tv.powerOn();
		tv.powerOff();
		tv.display();
		com.powerOn();
		com.powerOff();
		com.display();
	}

}
