package java_generic;

class Box <T extends Number>{
	private T item;
	public void setItem(T item) {
		this.item=item;
	}
	public T getItem() {
		return item;
	}
}

interface Movable{
	void move();
}
class Car implements Movable{

	@Override
	public void move() {
		System.out.println("자동차 출발");
	}
	
}
//제네릭 클래스
class Container <T extends Movable> {
	private T item;
	public Container(T item) {
		this.item=item;
	}
	public void makeMove() {
		item.move();
	}
}

public class GnericExample2 {

	public static void main(String[] args) {
//		Box<Integer> stringBox =new Box();
//		stringBox.setItem(3);
//		int value =stringBox.getItem();
//		System.out.println(value);
		
		Box<Double> doubleBox=new Box<Double>();
		doubleBox.setItem(2.4);
		System.out.println(doubleBox.getItem());
		
		Container<Car> container=new Container<>(new Car());
		container.makeMove();
	}

}
