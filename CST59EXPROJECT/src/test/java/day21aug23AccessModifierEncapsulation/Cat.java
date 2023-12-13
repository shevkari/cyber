package day21aug23AccessModifierEncapsulation;

public class Cat {


		private String name;
		
		// Package Protector/default
		void setName(String name)
		{
			this.name=name;
		}
		// Package Protector/default
		String getName()
		{
			return this.name;
		}
		
		public Cat(String name)
		{
			this.name = name;
		}
		Cat()
		{
			
		}
	}

	class CatRunner
	{
		public static void main(String[] args) {
			
			Cat d = new Cat();
			d.setName("miny"); 
			System.out.println(d.getName());
		}
	}


