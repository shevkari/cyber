package test11sept23;

public class SecondmaxofArray {

	private static void secMax(int[] b) {

		int max=b[0];
		
		for(int i=0; i<b.length; i++)
		{
			for(int j=i+1; j<b.length; j++) {
						
			if(b[i]<b[j]) // for Desending '<' & for Asecnding '>'
			{
				max = b[i];
				b[i] = b[j];
				b[j] = max;
			}
			
			}
			
		}
		for (int x : b) {
		System.out.print(x+" ");
		}
		System.out.println();
		
		
		System.out.println("By formating Array in Desending Order");
		int i=1;
		while(i<b.length)
		{
		if(b[0]!=b[i])
		{
			System.out.println("Second Max of Array is  = "+ b[i]);
		break;
		}		
		i++;
		}
  	}
	
//	System.out.println("By formating Array in Ascending Order");
//	int i= b.length-1;
//	while(i>0) {
//		if(b[i]!=b[i-1]) {
//			System.out.println(b[i-1]);
//		break;
//		}
//		i--;
//	}
//	}
	
	
	
	
	public static void main(String[] args) {

		int [] a = {79,16,78,71,79,79,72,65,34,790,799,72,78,76,79,79};
		
		secMax(a);
		
	}

	

}
