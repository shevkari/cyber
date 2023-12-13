package day27sept23Wrapperclass;

public class NumberOccured {

		static void getOccured(Long orgNo)
	{
		Long m;
		Long no=orgNo;
		
		for (int i =0; i<=9; i++)
		{
			int cnt =0;
		while(no!=0)
		{
			m = no % 10;
			no = no /10;
			
			if(m==i)
			{
				++cnt;
				
			}
		}
		System.out.println(i+"  Occuerd in Number times :"+cnt);
		
		no = orgNo;
		//cnt = 0;
	}
		
	}
	
	public static void main(String[] args) {

		Long no = 1692348037374037856L;

		
		getOccured(no);
		
	}

}
