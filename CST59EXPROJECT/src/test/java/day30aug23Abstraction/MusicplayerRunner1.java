package day30aug23Abstraction;

public class MusicplayerRunner1 extends Musicplayer {

	
	void playmusic() {
		System.out.println("Play Guitar");
	}
	
	public static void main(String[] args) {
		MusicplayerRunner1 Mpr = new MusicplayerRunner1();
		Mpr.playmusic();
		MusicplayerRunner1.play();
		
	}

}
