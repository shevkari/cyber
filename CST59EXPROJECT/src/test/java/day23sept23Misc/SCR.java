package day23sept23Misc;

public class SCR {

	public static void main(String[] args) {

		SC abc = SC.getinstance();
		System.out.println(abc.hashCode());
	
		SC abc1 = SC.getinstance();
		System.out.println(abc1.hashCode());
		
	}

}
