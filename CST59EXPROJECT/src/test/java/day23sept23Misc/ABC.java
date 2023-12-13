package day23sept23Misc;

public class ABC {

	private static ABC instance=null;
	private ABC()
	{
	}
	
	public static ABC getinstance()
	{
		if(instance==null)
		{
			instance = new ABC();
		}
		return instance;
	}
}
