package day04sept23_Array;

public class ArrayDemo {

	public static void main(String[] args) {

		int [] arr = new int[5];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
	//	System.out.println(arr[5]); //java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5

	//	System.out.println(arr[-1]); // java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 5

		System.out.println();
		System.out.println("After initailising values : - ");		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		System.out.println();
		System.out.println("Again initalised Values : - ");
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		
		System.out.println("arr[0] = " + arr[0]);  //arr[0] = 100
		System.out.println("arr[1] = " + arr[1]);
		System.out.println("arr[2] = " + arr[2]);
		System.out.println("arr[3] = " + arr[3]);
		System.out.println("arr[4] = " + arr[4]);
		
		System.out.println();
		System.out.println("length of array " + arr.length);
		
		System.out.println();
		
		System.out.println("Using FOR loop access array --->");
		
		for (int i=0; i<arr.length; i++)
		{
			System.out.println("arr[" + i + "] = " + arr[i]);
		}

		
		System.out.println();
		System.out.println("Using While loop access array --->");
		int i=0;
		while(i<arr.length)
		{
			System.out.println("arr[" + i + "] = " + arr[i]);
			i++;
		}
		
		System.out.println();
		System.out.println("Using Do-While loop access array --->");
		
		i=0;
		do {
			System.out.println("arr[" + i + "] = " + arr[i]);
			i++;
			
		}while(i<arr.length);
		
		
		System.out.println();
		System.out.println("arr : " + arr); // arr : [I@4517d9a3
		
		
		/*
		 * 		       1D
				       Integer
				       Hascode Hexadecimal
		/*		binary - 2 -0 and 1
				octal - 8 - 0 to 7
				decimal - 10 - 0 to 9
				hexadecimal - 16 - 0 to 9 A B C D E F
				                          a b c d e f
		*/		
		System.out.println();
		
		System.out.println("-----------------boolean array ->");
		boolean[] bArr = new boolean[4];
		for(int j=0;j<bArr.length;j++)
			System.out.println(bArr[j]);
		
		System.out.println();
		
		float[] farr = new float[5];
		for(int j=0; j<arr.length; j++)
		{
			System.out.println(farr[j]);
		}
		
		
		System.out.println();
		
		char[] carr = new char[5];
		for(int j=0; j<arr.length; j++)
		{
			System.out.println(carr[j]);
		}
		
		
		/*System.out.println();
		System.out.println("----------------- char array ->");
		char[] cArr = new char[5];
		for(int j=0;j<cArr.length;j++)
			System.out.println("****" + cArr[j] +"****");
		*/
		
		System.out.println();
		String [] sarr = new String[5];
		for(int j=0; j<arr.length; j++)
		{
			System.out.println(sarr[j]);
		}System.out.println("sArr = " + sarr);
		
		
		System.out.println();
		int[] parr = new int[] {1,2,3,4,5,6};
		int [] parr1 = new int[] {10,20,30,40,50};
		System.out.println("parr length =  " + parr.length);
		System.out.println("parr length =  " + parr1.length);
		System.out.println("sArr = " + parr);
		System.out.println("sArr1 = " + parr1);
		
		for (int j=0; j<parr.length; j++)
		{
			System.out.println("parr["+j+"]" + parr[j]);
		}
		
		System.out.println();
		for (int j=0; j<parr1.length; j++)
		{
			System.out.println("parr1["+j+"]" + parr1[j]);
		}
	}

}
