package java_interface;
abstract class Vehicle{
	private String name;
	private int Maxspeed;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getMaxspeed() {
		return Maxspeed;
	}



	public void setMaxspeed(int maxspeed) {
		Maxspeed = maxspeed;
	}


	abstract void move();
}
interface Flyable2{
	void fly();
}

class Car1 extends Vehicle{

	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("도로를 따라 이동중");
	}
	
}
class Airplane1 extends Vehicle implements Flyable2{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("고도 10000피트에서 비행중");
	}

	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("하늘을 날아가는중");
	}
	
}

public class ClassIntergrationPractice {

	public static void main(String[] args) {
		Vehicle car=new Car1();
		car.setName("bmw");
		car.setMaxspeed(200);
		Vehicle air=new Airplane1();
		air.setMaxspeed(500);
		air.setName("아시아나");
		Vehicle []arr= {car,air};
		for(Vehicle v:arr) {
			System.out.println(v.getName()+": "+v.getMaxspeed());
			v.move();
			if (v instanceof Airplane1) {
				((Airplane1) v).fly();
			}
		}
	}

}
