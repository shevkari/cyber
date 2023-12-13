package day30aug23Abstraction;

public class AndSmart extends AndroidSmartphone {


	@Override
	void playGraphicgames() {
		System.out.println("Graphic games");
	}

	@Override
	void makeAVideocall() {
		System.out.println("Videocall");
	}

	@Override
	void netSurfing() {
		System.out.println("netSurfing");
	}

	public static void main(String[] args) {
		
		AndSmart as = new AndSmart();
		as.makeAVideocall();
		as.netSurfing();
		as.playGraphicgames();
		
	}
	
}
