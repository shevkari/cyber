package day23sept23Misc;

public class SC1 {

	private static SC1 xyz=null;
	private SC1()
	{
		
	}
	
	public static SC1 getxyz()
	{
		if (xyz==null)
			xyz = new SC1();
		return xyz;
	}
}
