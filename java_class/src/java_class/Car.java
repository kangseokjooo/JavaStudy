package java_class;

public class Car {
	//멤버 변수
	private int speed;
	//접근제어자 
	//public:같은 클래스o,같은패키지,자식클래스,전체 다가능
	//protected:같은 클래스o,같은패키지,자식클래스
	//default:같은 클래스,같은패키지
	//private:같은 클래스에서만 가능
	
	//클래스 명과 동일해야됨 
	public Car(int speed) {
		this.speed = speed;
	}
	public void start() {
		System.out.println("Car Start");
	}
	public void increaseSpeed(int speed) {
		this.speed=this.speed+speed;
	}
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed>0) {
			this.speed = speed;			
		}
	}
	
//	//setter메소드 
//	public void setSpeed(int speed) {
//		this.speed=speed;
//	}
//	//getter
//	public int getSpeed() {
//		return this.speed;
//	}
	
	
}
