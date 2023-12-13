package day11sept23ObjVarLenArPassingAnonymousArray;

public class ArrayOfObject {

	public static void main(String[] args) {

		Object [] oArr = new Object[5];
		oArr[0]=1;
		oArr[1]=6.80f;
		oArr[2]='A';
		oArr[3]="AMOL";
		oArr[4]=!false;
		
		for (Object x : oArr)
		{
			System.out.println(x);
		}
		
	}

}
