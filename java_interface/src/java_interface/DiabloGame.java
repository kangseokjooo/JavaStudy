package java_interface;

public class DiabloGame implements GameConsole {

	@Override
	public void up() {
		System.out.println("Jump");
	}

	@Override
	public void down() {
		System.out.println("Down");

	}

	@Override
	public void right() {
		System.out.println("Right Jump");

	}

	@Override
	public void left() {
		System.out.println("Left Jump");

	}
	

}
