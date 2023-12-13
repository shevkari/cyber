package day26sept23WrapperClass;

public class WrapperClassDemo {

	public static void main(String[] args) {
		int i =10;
		Integer iobj = new Integer(i);
		System.out.println(iobj);
		
		System.out.println(iobj.MAX_VALUE);
		System.out.println(iobj.MIN_VALUE);
		
		System.out.println("-".repeat(15));
		float f = 12.64387f;
		Float fobj = new Float(f);
		System.out.println(fobj);
				
		System.out.println(fobj.MAX_VALUE);
		System.out.println(fobj.MIN_VALUE);
		
		System.out.println("-".repeat(15));
		
		
		
		
		byte b = 34;
		Byte bobj = new Byte(b);
		System.out.println(bobj);
		
		System.out.println(bobj.MIN_VALUE);
		System.out.println(bobj.MAX_VALUE);
		System.out.println("-".repeat(15));
		
		
		short s = 1234;
		Short sobj = new Short(s);
		System.out.println(sobj);
		
		System.out.println(sobj.MIN_VALUE);
		System.out.println(sobj.MAX_VALUE);
		System.out.println("-".repeat(15));
		
		
		long l = 132746703584769358l;
		Long lobj = new Long(l);
		System.out.println(lobj);
		
		System.out.println(lobj.MIN_VALUE);
		System.out.println(lobj.MAX_VALUE);
		System.out.println("-".repeat(15));
		
		
		double d = 13.463d;
		Double dobj = new Double(d);
		System.out.println(dobj);
		
		System.out.println(dobj.MIN_VALUE);
		System.out.println(dobj.MAX_VALUE);
		System.out.println("-".repeat(15));
		
		char ch = 'A';
		Character c = new Character(ch);
		System.out.println(c);
		
		System.out.println(c.MIN_VALUE);
		
		boolean bl= true;
		Boolean bbobj = new Boolean(bl);
		System.out.println(bbobj);
		
		System.out.println(bbobj.logicalOr(false, true));
		
		System.out.println(iobj.toString()+14);
		
	}

}
