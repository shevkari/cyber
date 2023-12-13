package day11sept23ObjVarLenArPassingAnonymousArray;

public class ArrayOfObjects {

	public static void main(String[] args) {

		Car [] cArr = new Car[5];
		
		Car c1 = new Car(10000,"BMW");
		Car c2 = new Car(20000,"Audi");
		Car c3 = new Car(30000,"Volvo");
		Car c4 = new Car(40000,"Tesla");
		Car c5 = new Car(50000,"Rolls");
		
		cArr[0] = c1;
		cArr[1] = c2;
		cArr[2] = c3;
		cArr[3] = c4;
		cArr[4] = c5;
		
		for (Car car : cArr) {
			System.out.println(car);
			}
		
		for (int i=0; i<cArr.length; i++)
		{
			System.out.println(cArr[i]);
		}
	}

}
