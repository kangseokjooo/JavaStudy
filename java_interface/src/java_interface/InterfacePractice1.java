package java_interface;


 interface Playable{
	 void play();
	 void pause();
	 void stop();
 }
 class MP3Player implements Playable{

	@Override
	public void play() {
		System.out.println("MP3 play");
	}

	@Override
	public void pause() {
		System.out.println("MP3 pause");
	}

	@Override
	public void stop() {
		System.out.println("MP3 stop!!!!");
		
	}
	 
 }
 class DVDPlayer implements Playable{

	@Override
	public void play() {
		System.out.println("DVD play");
	}

	@Override
	public void pause() {
		System.out.println("DVD pause");
	}

	@Override
	public void stop() {
		System.out.println("DVD stop");
	}
	 
 }
public class InterfacePractice1 {

	public static void main(String[] args) {
		MP3Player mp3=new MP3Player();
		DVDPlayer dvd=new DVDPlayer();
		
		mp3.play();
		mp3.pause();
		mp3.stop();
		dvd.play();
		dvd.pause();
		dvd.stop();
	}

}
