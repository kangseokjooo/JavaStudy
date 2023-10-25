package java_interface;

interface Move {
	void moveForward();
	void moveBackward();
}
interface Power{
	void powerOn();
	void powerOff();
}
//인터페이스는 인테페이스를 상속받을 수 있다.
//다중 상속이 가능.
interface Car extends Move,Power{
	void changeGear(int gear);
}
class Suv implements Car{

	@Override
	public void moveForward() {
		System.out.println("Go Forward");
	}

	@Override
	public void moveBackward() {
		System.out.println("Go Backward");

	}

	@Override
	public void powerOn() {
		System.out.println("Power On");

	}

	@Override
	public void powerOff() {
		System.out.println("Power OFF");

	}

	@Override
	public void changeGear(int gear) {
		System.out.println("Change Gear: "+gear);
	}
	
}
public class InterfaceExample2 {

	public static void main(String[] args) {
		Suv suv=new Suv();
		suv.changeGear(6);
		suv.moveForward();
		suv.moveForward();
		suv.powerOn();
		suv.powerOff();
		
	}

}
