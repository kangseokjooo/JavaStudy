package java_interface;

public class GameMain {

	public static void main(String[] args) {
		LoLGame lol=new LoLGame();
		DiabloGame dia=new DiabloGame();
		lol.up();
		lol.down();
		lol.right();
		lol.left();
		
		dia.up();
		dia.down();
		dia.right();
		dia.left();
	}

}
