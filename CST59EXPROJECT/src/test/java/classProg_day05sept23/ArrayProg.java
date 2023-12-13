package classProg_day05sept23;

public class ArrayProg {

	public static void main(String[] args) {
		int sum =0;
		int [] a = new int [] {21,12,2,3,9};
		for (int i : a) {
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println("**** Addition of elements of ARRAY ****");
		for(int i=0 ; i<a.length; i++)
		{
			sum = sum + a[i];
			
		}
		System.out.println("addition of array element :- " + sum );
		
		
		System.out.println();
		System.out.println("**** Average of Array element ****");
		float avg = (float)sum/a.length;
		System.out.println(avg);
		
		
		System.out.println();
		System.out.println("**** Max Element ****");
		int max=0;
		for(int k=0; k<a.length; k++)
		{
			if (a[k]>max)
			{
				max = a[k];
			}
		}
		System.out.println(max);
		
		
		System.out.println();
		System.out.println("**** Min Element ****");
		int min=a[0];
		for(int k=1; k<a.length; k++)
		{
			if (a[k]<min)
			{
				min = a[k];
			}
		}
		System.out.println(min);
		
		
		System.out.println();
		System.out.println("**** Even Elements ****");
		
		for(int i=0; i<a.length; i++)
		{
		if(a[i] % 2 == 0)
		{
			System.out.println("Even Element of array : " +a[i]);
		}
		}	
		
		System.out.println();
		System.out.println("**** Odd Elements ****");
		
		for(int i=0; i<a.length; i++)
		{
		if(a[i] % 2 != 0)
		{
			System.out.println("Odd Element of array : " +a[i]);
		}
		}	
		
		System.out.println();
		System.out.println("**** Occurance of given Elements ****");
		int n =12,count=0;
		for(int i=0; i<a.length; i++)
		{
		if(n==a[i])
		{
		System.out.println(++count);
		
		}
		}
		
		/*System.out.println();
		   System.out.println(); System.out.println("**** Ascending Order ****");
		 
		   int swap=0, i ; 
		   for ( i=0; i<a.length; i++) {
			   for(int j=i+1; j<a.length; j++)
			   {
			   if(a[i]>a[j])
			   {
				   swap = a[i];
				   a[i] = a[j];
				   a[j] = swap;
			   }
//			   System.out.println(swap);
//			   System.out.println(a[i]);
//			   System.out.println(a[j]);
//			   System.out.println();
		   }
		   
		   }
		   for ( i=0; i<a.length; i++)
		   System.out.println(a[i]); 
		 */
		
		System.out.println();
		System.out.println("**** Reverse Array ****");
		for(int j=a.length-1; j>=0; j--)
		{
		System.out.println(a[j]);
		
		}
		
		System.out.println();
		   System.out.println(); System.out.println("**** Ascending Order ****");
		 
		   int swap=0, i ; 
		   for ( i=0; i<a.length; i++) {
			   for(int j=i+1; j<a.length; j++)
			   {
			   if(a[i]>a[j])
			   {
				   swap = a[i];
				   a[i] = a[j];
				   a[j] = swap;
			   }
//			   System.out.println(swap);
//			   System.out.println(a[i]);
//			   System.out.println(a[j]);
//			   System.out.println();
		   }
		   
		   }
		   for ( i=0; i<a.length; i++)
		   System.out.println(a[i]); 
		 
		
		
		
		System.out.println();
		   System.out.println(); System.out.println("**** Descending Order ****");
		 
		   int temp=0, k ; 
		   for ( k=0; k<a.length; k++) {
			   for(int j=k+1; j<a.length; j++)
			   {
			   if(a[k]<a[j])
			   {
				   temp = a[k];
				   a[k] = a[j];
				   a[j] = temp;
				   
				}
//			   System.out.println(temp);
//			   System.out.println(a[k]);
//			   System.out.println(a[j]);
//			   System.out.println();
		   }
		   
		   }
		   for ( k=0; k<a.length; k++)
		   System.out.println(a[k]); 
		
		
		
		//sum of all elements
		//avg of all elements
		// max of elememts
		// min elements
		// even
		//odd
		//occurance of given no 12 in array
		// asecending order
		//in reverse format
	}

}
