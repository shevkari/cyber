package day18aug23;

	class Counter {

	static int count;
	
	public Counter()
	{
		count++;
	}
}
	public class ObjectCount{ 
	
	public static void main(String[] args) {
		Counter o1 = new Counter();
		System.out.println(o1.count);
		Counter o2 = new Counter();
		System.out.println(o2.count);
		Counter o3 = new Counter();
		System.out.println(o3.count);
		
		
		
	}

}
