package day23aug23;

public class Bathroom {

	int mirrors;
	int tubs;
	
	public Bathroom(int mirrors, int tubs)
	{
		this.mirrors=mirrors;
		this.tubs=tubs;
	}
	
	@Override
	public String toString() {
		return  mirrors + " : " + tubs ;
	}



	public static void main(String[] args) {
		
		/*Bathroom B1 = new Bathroom(4,6);
		System.out.println(B1);*/
	}

}
