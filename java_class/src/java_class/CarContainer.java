package java_class;

public class CarContainer {

	public static void main(String[] args) {
		Car bmw=new Car(30);
		Car kia=new Car(20);
		
		//잘못된 접근방법 
//		bmw.speed=120;
//		kia.speed=90;
		
		
		bmw.start();
		kia.start();
		//잘못된값에대해서 유효성검사 
//		bmw.setSpeed(-120);
//		kia.setSpeed(-90);
		
//		int bmwSpeed=bmw.getSpeed();
//		bmwSpeed=bmwSpeed+100;
//		bmw.setSpeed(bmwSpeed);
//		
//		int kiaSpeed=kia.getSpeed();
//		kiaSpeed=kiaSpeed+80;
//		kia.setSpeed(kiaSpeed);
		
		bmw.increaseSpeed(140);
		kia.increaseSpeed(110);
		
		System.out.println("bmw:"+bmw.getSpeed());
		System.out.println("kia:"+kia.getSpeed());
	}

}
