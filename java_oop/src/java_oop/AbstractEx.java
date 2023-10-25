package java_oop;

//추상 클래스
abstract class Animals{
	
	//추상 메서드
	abstract public void Sound();
	//일반 메서드
	public void sleep(){
		System.out.println("동물이 잠을 잔다");
	}
	
}

class Chickhen extends Animals{
	@Override
	public void Sound() {
		System.out.println("꼬끼오!");
	}
}

public class AbstractEx {

	public static void main(String[] args) {
		//추상클래스는 인스턴스화 할 수 없음...
		Chickhen chickhen =new Chickhen();
		
		chickhen.Sound();
		chickhen.sleep();
	}

}
