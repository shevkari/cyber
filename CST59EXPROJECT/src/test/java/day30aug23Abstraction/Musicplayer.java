package day30aug23Abstraction;

public abstract class Musicplayer {
	
	void playmusic() {
		System.out.println("Play Music");
	}
	
	static void play()
	{
		System.out.println("play");
	}
	
	public static void main(String[] args) {
		Musicplayer mp;
	//	Musicplayer MP = new Musicplayer(); // not allowed due to abstract class
	}

}
