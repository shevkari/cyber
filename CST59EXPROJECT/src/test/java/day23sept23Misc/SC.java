package day23sept23Misc;

public class SC {


		private static SC instance=null;
		private SC()
		{
		}
		
	public static SC getinstance ()
	{
		if(instance==null)
		{
			instance = new SC();
		}
		return instance;
	}

}
